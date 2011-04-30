package com.co

import grails.test.*

class RedditControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testIndex() {
        controller.index()
        String response = controller.response.contentAsString
        println response
        println response
        assertTrue response.contains("Cat")
    }
}
