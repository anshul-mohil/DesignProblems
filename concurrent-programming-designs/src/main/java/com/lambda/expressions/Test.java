/**
 * The MIT License
 * Copyright (c) 2018 Anshul Mohil
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.lambda.expressions;

// A simple program to demonstrate the use
// of predicate interface

import java.util.Arrays;
import java.util.List;

/**
 * EntryPoint
 */
public class Test {
  /**
   * @param args none
   */
  public static void main(String[] args) {

    // create a list of strings
    List<String> names =
        Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");


    // declare the predicate type as string and use
    // lambda expression to create object
    //Predicate<String> p = (s)->s.startsWith("G");
    MyFunctionalInteface<String> p = (s) -> s.startsWith("G");
    // Iterate through the list
    for (String st : names) {
      // call the test method
      if (p.test(st)) {
        System.out.println(st);
      }
    }
  }
}