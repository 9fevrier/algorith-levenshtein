algorithm-levenstein
====================

A light Java implementation of the Levenstein algorithm.

## Installation

To do

## How to build

Use Maven 3.x to compile then to package this library :

    mvn clean compile package

## Usage

    import nf.libs.algorithms.Levensthein;
    
    int distance = Levenshtein.distance("my first string", "my second string!");
    System.out.println(String.format("distance = %d", distance));

## See

* [Levenshtein Distance (fr)](https://fr.wikipedia.org/wiki/Distance_de_Levenshtein)
* [Algorithm Implementation/Strings/Levenshtein distance](https://en.wikibooks.org/wiki/Algorithm_Implementation/Strings/Levenshtein_distance)

## Change history

* Improve README.md

## License

    The MIT License (MIT)
    
    Copyright (c) 2016 9 Février

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.


