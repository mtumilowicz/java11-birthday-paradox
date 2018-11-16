# java11-birthday-paradox
Simulation of birthday paradox.

_Reference_: https://en.wikipedia.org/wiki/Birthday_problem

# definition
In probability theory, the birthday problem or birthday paradox concerns 
the probability that, in a set of n randomly chosen people, some pair of 
them will have the same birthday.

Assumption - year has 365 days.

* `99.9%` probability is reached with just 70 people
* `50%` probability with 23 people. 

These conclusions are based on the assumption that each day of the year 
(excluding February 29) is equally probable for a birthday.

# proof
* `50%` probability with 23 people. 
    * A - at least two people have the same birthday
    * A' - no two people have the same birthday
    
    `P(A) = 1 - P(A')`
    
    So, for n = 23, we have equation:
    
    `P(A') = 365 / 365 * 364 / 365 * 363 / 365 * ... * 343 / 365 ~ 0,492703`
    
    So `P(A) > 0,5`
* `99.9%` probability is reached with just 70 people
    * same reasoning as above
# simulation


# tests
During tests we are using https://en.wikipedia.org/wiki/Central_limit_theorem