/*

Contrary to Java assertions which have to be explicitly enabled,
Groovy assertions are enabled by default. Groovy uses an assertion
variant called "power assertion", and one of its benefits is that
in shows the evaluation results.

observe the output:
*/

assert 1 == (3 + (4 + 100)) * 2 / (9 * 3 * (5 - 2))