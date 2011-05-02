package com.co

import grails.test.GrailsUnitTestCase

class RedditServiceTests extends GrailsUnitTestCase {

  def redditService

  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  void testCanHasCheeseBurger() {
    def cats = redditService.breedCats()
    println cats
    assertTrue cats.findAll { it.canHasCheeseburger }.size() >= 4
    assertTrue cats.findAll { !it.canHasCheeseburger }.size() >= 4
  }

  void testBreedManyCats() {
    def cats = redditService.breedCats(20)
    assertTrue cats.size() == 20
  }

  void testBreedCats() {
    def cats = redditService.breedCats()
    assertTrue cats.size() == 10
  }

  void testCrazyCatLady() {
    def catLady = []
    catLady.metaClass.isCrazy = {
      size() > 3
    }
    assertFalse catLady.isCrazy()

    //go collect strays
    10.times {
      redditService.breedCats().collect { catLady << it }
    }

    assertTrue catLady.size() == 100
    assertTrue catLady.isCrazy()
  }
}
