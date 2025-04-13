# Assignment 2 – Custom Data Structures in Java

## 👨‍💻 Description

This project is part of the second assignment for the course. The goal is to implement custom versions of common data structures in Java **without using `java.util`**, except for `Iterator`.

All classes implement a common interface `MyList<T>` and are tested in `Main.java`.

---

## 🔧 Implemented Classes

### 1. MyArrayList<T>
A custom dynamic array implementation based on `Object[]` with automatic resizing and basic operations.

### 2. MyLinkedList<T>
A doubly linked list implementation with `MyNode` class, supporting insertions and deletions at both ends.

### 3. MyStack<T>
A LIFO (Last In, First Out) stack implemented using MyArrayList.

### 4. MyQueue<T>
A FIFO (First In, First Out) queue implemented using MyLinkedList.

### 5. MyMinHeap<T>
A custom min-heap data structure implemented with MyArrayList using `Comparable<T>`.

---


