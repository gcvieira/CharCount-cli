# CharCount-cli, what is it?

CharCount-cli is a simple command line tool that counts the occurrence of each ASCII character in a file. It's meant to be easy to use.

# System requirements

- Java 8 or newer

This was developed with Java 16 on Ubuntu 22.04, but it should run on Windows and MacOS as long as Java is installed.

# How to use it

Compiling the program:

    javac CharCount.java
    
Running it:

    java CharCount filename.txt

The filename has to be passed as an argument. This is the file the program will read and count the characters.

The program will run and print the results on the screen.

If you want to save the results to a file, you can do so like this:

    java CharCount filename.txt > results.txt

# How it works

Although Java was originally designed for use with teletypes, the modern versions actually use Unicode, which includes [ASCII](https://www.asciitable.com/).

As some ASCII characters are special (e.g. STX, TAB, CR...) this program only considers the characters from (decimal) 32 up to 127, that is, from \<Space\> to \<DEL\>.

If you feel like implementing full Unicode support, go for it! This project is free software and contributions (and feedback) are welcome!

The algorithm itself is very simple and runs at O(n) time (n being the number of characters) as it only needs to go through each character and increment one value. it's only one line of code!

# Example output

This example was ran on a text file with the King James Version of the Bible.

It outputs each character with its decimal ASCII code and inside the square brackets is how many times that character appears in the file.

The output should look like this:

    32:   [751115]
    33: ! [314]
    34: " [22]
    35: # [1]
    36: $ [2]
    37: % [1]
    38: & [0]
    39: ' [2024]
    40: ( [241]
    41: ) [241]
    42: * [31]
    43: + [0]
    44: , [70717]
    45: - [98]
    46: . [26420]
    47: / [24]
    48: 0 [5320]
    49: 1 [27091]
    50: 2 [18978]
    51: 3 [12259]
    52: 4 [9150]
    53: 5 [7053]
    54: 6 [6472]
    55: 7 [5917]
    56: 8 [5779]
    57: 9 [5643]
    58: : [43828]
    59: ; [10139]
    60: < [0]
    61: = [0]
    62: > [0]
    63: ? [3297]
    64: @ [2]
    65: A [17915]
    66: B [4714]
    67: C [1698]
    68: D [8782]
    69: E [2710]
    70: F [2386]
    71: G [6206]
    72: H [3208]
    73: I [13302]
    74: J [6374]
    75: K [547]
    76: L [9222]
    77: M [3056]
    78: N [1891]
    79: O [8896]
    80: P [1877]
    81: Q [6]
    82: R [7568]
    83: S [4906]
    84: T [7763]
    85: U [333]
    86: V [107]
    87: W [2408]
    88: X [2]
    89: Y [569]
    90: Z [904]
    91: [ [2]
    92: \ [0]
    93: ] [2]
    94: ^ [0]
    95: _ [0]
    96: ` [0]
    97: a [257815]
    98: b [44161]
    99: c [53373]
    100: d [149313]
    101: e [409525]
    102: f [81157]
    103: g [49096]
    104: h [279471]
    105: i [180660]
    106: j [2515]
    107: k [21745]
    108: l [120716]
    109: m [76884]
    110: n [223166]
    111: o [234290]
    112: p [41377]
    113: q [958]
    114: r [162761]
    115: s [185124]
    116: t [309983]
    117: u [83140]
    118: v [30258]
    119: w [63079]
    120: x [1476]
    121: y [58007]
    122: z [2068]
    123: { [0]
    124: | [0]
    125: } [0]
    126: ~ [0]
    127:   [0]
