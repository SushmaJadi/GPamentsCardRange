# Outline

## Background

In a 3D Secure (3DS) system, the 3DS Server receives a message from the Directory Server. Each message contains card range data, including a BIN range and an associated 3DS Method URL.

## Objective

Develop a Java-based system that:

1. Stores incoming PRes messages efficiently
    * Sample response attached: 700k.json.zip
    * Optional: create code to provide a larger sample to test your code
2. Allows retrieval of the corresponding 3DS Method URL using a given PAN (Primary Account Number)

The focus is on:

* Speed and efficiency in lookup
* Solid data modelling and test coverage
* Readable, maintainable code

## Requirements

1. Input:
    * A PRes message object containing:
        * startBIN (e.g., 400000)
        * endBIN (e.g., 400999)
        * threeDSMethodURL
2. Store the card range and URL data from each PRes message.
3. Implement a Restful API with Spring boot 3:
    * Given a PAN, return the matching Start and End Card ranges, and 3DS Method URL, if any
4. Include:
    * Unit tests for storage and retrieval logic

## Technical Guidelines

* Provide a README with setup, build, and usage instructions.
