Linear Search means search an element or targeted element from an array by checking/traversing each element in the array until it found.

It is the simplest searching technique in computer science and requires no preprocessing, meaning the dataset does not need to be sorted before searching

How It Works (Step-by-Step)

1. Start at the first element (index 0) of the collection.
2. Compare the current element with the target value.
3. If a match is found, the algorithm successfully stops and returns the position or index of the element.
4. If there is no match, it moves to the next sequential element and repeats the comparison.
5. If the end of the collection is reached without finding a match, the algorithm returns a value indicating the target is missing (typically -1).

Time Complexity:
=> Best-Case: (O(1)) – Occurs when the target value is the very first element checked in the collection.
=> Worst-Case: (O(n)) – Occurs when the target value is at the very end of the collection or not present at all, requiring (n) total comparisons.
=>Average-Case: (O(n)) – On average, the algorithm will inspect roughly half of the elements in the dataset.
