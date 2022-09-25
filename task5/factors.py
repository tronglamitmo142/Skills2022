import unittest

def factors(n):
    p = 2
    f = list()
    while n >= p*p: 
        if n % p == 0:
            f.append(p)
            n = int(n/p)
        else:
            p = p + 1
    f.append(n)
    return f 

class TestFactor(unittest.TestCase):
    def test_factor(self):
        actual = factors(18)
        expected = [2, 3, 6, 9, 18]
        self.assertEqual(actual, expected)

