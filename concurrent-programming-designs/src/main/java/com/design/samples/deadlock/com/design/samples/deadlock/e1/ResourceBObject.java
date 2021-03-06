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
package com.design.samples.deadlock.com.design.samples.deadlock.e1;

/**
 *
 */
public class ResourceBObject implements Resource {

  ResourceAObject resource = null;

  /**
   * When this synchronized method is called com.design.samples.deadlock.com.design.samples.deadlock.e1.ResourceAObject
   * will be locked by calling thread.
   *
   * @param resource expects resource on which current thread can obtain lock.
   */
  public synchronized void updateCurrentFromResource(ResourceAObject resource) {

    this.resource = resource;

    String threadName = Thread.currentThread().getName();
    System.out.println(threadName);
    try {
      Thread.sleep(1000);
      System.out.println("B Object Reached post sleep");
    } catch (InterruptedException ie) {
      System.out.println(ie.getMessage());
    }
    this.resource.getString();
  }

  /**
   * @return toString of object
   */
  public synchronized String getString() {
    String toString = "From Resource B Object";

    System.out.println(toString);
    return toString;
  }
}
