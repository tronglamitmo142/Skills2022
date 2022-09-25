import unittest

def is_prime(number):
    if number <= 1:
        return False
    for n in range(2, number):
        if number % 2 == 0:
            return False
    else:
        return True 

class TestIsPrime(unittest.TestCase):
    def test_is_prime(self):
        actual = is_prime(7)
        expected = True
        self.assertEqual(actual, expected)
