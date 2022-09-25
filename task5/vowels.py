import unittest

def vowels(text):
    v = list()
    for i in text:
        if i in 'aeiouAEIOU':
            v.append(i)
    return v 

class TestVowels(unittest.TestCase):
    def test_vowels(self):
        actual = vowels('NguyenTrongLam')
        expected = ['u', 'e', 'o', 'a']
        self.assertEqual(actual, expected)