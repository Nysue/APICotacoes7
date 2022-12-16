from unittest.mock import patch
import unittest
from io import StringIO
import sys
import logging

logger = logging.getLogger()
logger.level = logging.DEBUG


class StdIOTestContainer(unittest.TestCase):
    @staticmethod
    def formated(lines):
        return list(lines.splitlines())

    @staticmethod
    def runFunction(user_input, func):
        with patch('builtins.input', side_effect=StdIOTestContainer.formated(user_input)), patch('sys.stdout', new_callable=StringIO) as out:
            func()

        return out.getvalue()

    @staticmethod
    def runningTest(user_input, expected, func):
        actual = StdIOTestContainer.runF