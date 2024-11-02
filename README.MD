I saw this regular expression being mentioned on YouTube and I have to try it out myself.

This is the regular expression.

```
^.?$|^(..+?)\1+$
```

This is the source. 
[Demystifying The Regular Expression That Checks If A Number Is Prime](https://illya.sh/the-codeumentary-blog/regular-expression-check-if-number-is-prime/)

After testing a few prime numbers, the test starts to take exponentially longer to complete with each digit added starting from a **7 digit** prime.