package com.co

class RedditService {

    static transactional = true

    def breedCats() {
        def cats = []
        10.times {
            cats.add(new Cat(canHasCheeseburger: 10 % it == 0))
        }
        cats
    }
}
