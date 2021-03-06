# google_foobar

Test 1: A pirate walks into a bar...
============================

You must hurry to find Professor Boolean's secret lab. You fear it may be too late.

Rumor has it that one of the pirates in this tavern knows where it is. There's a whole row of them seated at the bar. You start by talking to the pirate seated on the left-most barstool. However, the pirate redirects you to another pirate. Fine... you go to talk to that one. To your great annoyance, that pirate redirects you to yet another pirate! And on and on it goes. Is there no end to this madness? You notice each pirate has a number tattooed on his arm and decide to ID each man by his number. Each pirate redirects to a different pirate, other than himself. Because of this, it is guaranteed that you will start going in loops talking to them.

Write a function answer(numbers) which returns the number of pirates which form a loop, given that you start by talking to the left-most pirate, 0. numbers will be an array of non-negative integers such that number[m] is the number of the pirate to whom pirate m redirects. No pirate redirects to himself. The left-most pirate is number 0, the next is number 1, and so on. Each element in the numbers list will be in the range [0, n-1] where n is the length of the numbers list.

For example, suppose the numbers list were [1, 3, 0, 1]. Then pirate 0 redirects to pirate 1, who redirects to pirate 3, who redirects back to pirate 1. There is a loop of two pirates: 1, 3. Thus the answer would be 2. Note that even though you started with pirate 0, he is not part of the loop.

The number of pirates will be at least 2 and no more than 5000.

Test cases
==========

Inputs:
    (int list) numbers = [1, 0]
Output:
    (int) 2

Inputs:
    (int list) numbers = [1, 2, 1]
Output:
    (int) 2
    
Test 2: Peculiar balance
================

Can we save them? Beta Rabbit is trying to break into a lab that contains the only known zombie cure - but there's an obstacle. The door will only open if a challenge is solved correctly. The future of the zombified rabbit population is at stake, so Beta reads the challenge: There is a scale with an object on the left-hand side, whose mass is given in some number of units. Predictably, the task is to balance the two sides. But there is a catch: You only have this peculiar weight set, having masses 1, 3, 9, 27, ... units. That is, one for each power of 3. Being a brilliant mathematician, Beta Rabbit quickly discovers that any number of units of mass can be balanced exactly using this set.

To help Beta get into the room, write a method called answer(x), which outputs a list of strings representing where the weights should be placed, in order for the two sides to be balanced, assuming that weight on the left has mass x units.

The first element of the output list should correspond to the 1-unit weight, the second element to the 3-unit weight, and so on. Each string is one of:

"L" : put weight on left-hand side
"R" : put weight on right-hand side
"-" : do not use weight

To ensure that the output is the smallest possible, the last element of the list must not be "-".

x will always be a positive integer, no larger than 1000000000.

Test cases
==========

Inputs:
    (int) x = 2
Output:
    (string list) ["L", "R"]

Inputs:
    (int) x = 8
Output:
    (string list) ["L", "-", "R"]
