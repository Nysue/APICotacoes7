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
        actual = StdIOTestContainer.runFunction(user_input, func)

        testCase = unittest.TestCase()
        testCase.assertEqual(expected, actual)

        StdIOTestContainer.info("done")

    @staticmethod
    def info(msg):
        stream_handler = logging.StreamHandler(sys.stderr)
        logger.addHandler(stream_handler)

        try:
            logging.getLogger().info(msg)
        finally:
            logger.removeHandler(stream_handler)


"""
import sys
sys.path.append('.')

from lgy.algorithm.StdIOTestContainer import StdIOTestContainer as T

def main():

user_input = '''
'''

expected = '''
'''

T.runningTest(user_input.strip(), expected.lstrip(), main)
"""