package com.co

import grails.test.GrailsUnitTestCase

class CatTests extends GrailsUnitTestCase {

  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  def testCatSpeak(){
    def cat = new Cat()
    assertTrue cat.speak() ==~ /(?i)meow/
  }
}
