# Inference Engine using Forward & Backward Chaining.

## Intrduction:

An Inference engine used in expert systems, that can carry out forward chaining and backward chaining.

## Inputs:

-   Input file: _data/in.txt_.

-   Input format:

    1. First line => Query.
    2. Second line => Facts base
    3. Rest => Knowledge base.

-   For examples, check the file: _ data/example_in.txt _

## Output:

-   Forward Chaining:
    The program prints the applicable rule and the facts base for each iteration, the final result includes wether the query is proven or not, and the execution sequence.

-   Backward Chaining:
    At iteration it prints the fact to establish, the premise to established. Also, the proven facts are marked between brackets.
    at the end, the final line of the output summarize wether the query is prooven or not.

## Useful Links:

-   For more information about[Forward Chaining](https://en.wikipedia.org/wiki/Forward_chaining).
-   For more information about[Backward Chaining](https://en.wikipedia.org/wiki/Backward_chaining).
