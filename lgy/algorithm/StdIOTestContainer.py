from unittest.mock import patch
import unittest
from io import StringIO
import sys
import logging

logger = logging.getLogger()
logger.level = logging.DEBUG


class StdIOTestContainer(unittest.TestCase):
    @staticmethod
   