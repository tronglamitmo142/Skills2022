import unittest

class TestLen(unittest.TestCase):
    def test_len(self):
        actual = len([1,2,3,4,5])
        expected = 5
        self.assertEqual(actual, expected)