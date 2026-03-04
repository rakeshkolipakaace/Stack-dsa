# 📚 Stack & Queue DSA Problem Collection

A comprehensive **multi-language data structures and algorithms repository** focused on mastering **Stacks and Queues**. This repository contains 25+ complete problems with multiple solution approaches, detailed explanations, and optimal algorithms. Perfect for interview preparation, DSA learning, and competitive programming.

## 🎯 Overview

**Stack-DSA** is an educational repository showcasing essential stack and queue problems covering fundamentals to advanced topics. Each problem includes brute force and optimal solutions with detailed explanations, complexity analysis, and real-world applications.

**Repository Type**: DSA Problem Collection  
**Primary Language**: Java  
**Total Problems**: 25+ problems  
**Difficulty Level**: Beginner to Advanced  
**Key Topics**: Stack Implementation, Queue Implementation, Expression Conversion, Monotonic Stacks  
**Time Complexity**: O(n) to O(n²) depending on approach  
**Space Complexity**: O(1) to O(n)  
**Status**: Complete with comprehensive solutions  

---

## 📁 Repository Structure

```
Stack-dsa/
├── Stack/                          # Stack Problems & Implementations
│   ├── Lecture-1/                 # Fundamentals & Basic Problems
│   │   ├── Solution.java          # Basic stack implementation
│   │   ├── stackbyll.java         # Stack using linked list
│   │   ├── stackwQ.java           # Stack using queue
│   │   ├── Validparanthesis.java  # Valid parenthesis checking
│   │   └── Minstack.java          # Min stack with O(1) getMin()
│   ├── Lecture-2/                 # Expression Conversion
│   │   ├── infixttopost.java      # Infix to postfix conversion
│   │   ├── posttoinfix.java       # Postfix to infix conversion
│   │   ├── posttoprefix.java      # Postfix to prefix conversion
│   │   ├── pretoinfix.java        # Prefix to infix conversion
│   │   └── pretopost.java         # Prefix to postfix conversion
│   └── Lecture-3/                 # Advanced Stack Algorithms
│       ├── Nextgreater.java       # Next greater element
│       ├── Nextgreater2.java      # Circular next greater
│       ├── Nextsmallest.java      # Next smallest element
│       ├── NGE.java               # Next greater element variant
│       ├── Astroid.java           # Asteroid collision
│       ├── Reversepolishnotation/ # Reverse Polish notation evaluation
│       ├── Reversek/              # Reverse k groups
│       └── Lettercasepermutation/ # Letter case permutation
├── Queue/                          # Queue Problems & Implementations
│   └── Lecture-1/                 # Queue Fundamentals
│       ├── Queue.java             # Basic queue implementation (linked list)
│       ├── Queuebyarrays.java     # Queue using arrays
│       ├── Queuesbystack.java     # Queue using stacks
│       └── tickets/               # Ticket system using queue
├── temparatues.java               # Daily temperatures problem
├── online stock span.java          # Online stock span problem
└── README.md                       # Documentation
```

---

## 🏢 Problem Categories

### **Lecture-1: Fundamentals (5 Problems)**

#### 1. **Basic Stack Implementation** (Solution.java)
- **Time**: O(1) for push/pop
- **Space**: O(n)
- **Approach**: Array-based stack
- **Features**: Push, pop, isEmpty, isFull

#### 2. **Stack Using Linked List** (stackbyll.java)
- **Time**: O(1) for push/pop
- **Space**: O(n)
- **Dynamic size**: Grows as needed
- **Better for**: Unknown size stacks

#### 3. **Stack Using Queue** (stackwQ.java)
- **Time**: O(n) for push/pop
- **Space**: O(n)
- **Approach**: Single or dual queue implementation
- **Learning**: Queue-to-Stack conversion

#### 4. **Valid Parenthesis** (Validparanthesis.java)
- **Problem**: Check if brackets are balanced
- **Time**: O(n)
- **Space**: O(n)
- **Approach**: Stack matching
- **Patterns**: (), [], {}

#### 5. **Min Stack** (Minstack.java)
- **Problem**: O(1) getMin() with O(1) push/pop
- **Time**: O(1) all operations
- **Space**: O(n) - dual stack approach
- **Optimal**: Track minimum at each level

---

### **Lecture-2: Expression Conversion (5 Problems)**

#### 1. **Infix to Postfix** (infixttopost.java)
- **Time**: O(n)
- **Space**: O(n)
- **Algorithm**: Operator precedence + stack
- **Application**: Expression evaluation
- **Example**: `a+b*c` → `abc*+`

#### 2. **Postfix to Infix** (posttoinfix.java)
- **Time**: O(n)
- **Space**: O(n)
- **Algorithm**: Stack-based reconstruction
- **Example**: `abc*+` → `a+b*c`

#### 3. **Postfix to Prefix** (posttoprefix.java)
- **Time**: O(n)
- **Space**: O(n)
- **Algorithm**: Two-stack approach
- **Example**: `abc*+` → `+a*bc`

#### 4. **Prefix to Infix** (pretoinfix.java)
- **Time**: O(n)
- **Space**: O(n)
- **Algorithm**: Right-to-left processing
- **Example**: `+a*bc` → `a+b*c`

#### 5. **Prefix to Postfix** (pretopost.java)
- **Time**: O(n)
- **Space**: O(n)
- **Algorithm**: Reverse and process
- **Example**: `+a*bc` → `abc*+`

---

### **Lecture-3: Advanced Algorithms (8+ Problems)**

#### 1. **Next Greater Element** (Nextgreater.java)
- **Brute**: O(n²) - nested loops
- **Optimal**: O(n) - monotonic stack
- **Space**: O(n)
- **Approach**: Right-to-left traversal
- **Example**: [1,5,0,3,4,5] → [5,(-1),3,4,5,(-1)]

#### 2. **Circular Next Greater** (Nextgreater2.java)
- **Time**: O(2n) - circular array
- **Space**: O(n)
- **Approach**: Process array twice
- **Example**: [1,2,1] → [2,-1,2]

#### 3. **Next Smallest Element** (Nextsmallest.java)
- **Time**: O(n)
- **Space**: O(n)
- **Similar**: To next greater but min
- **Approach**: Left-to-right traversal

#### 4. **Asteroid Collision** (Astroid.java)
- **Brute**: O(n²) - simulate collisions
- **Optimal**: O(n) - stack-based
- **Problem**: Find survivors after explosions
- **Key**: Left vs right-moving asteroids

#### 5. **Reverse Polish Notation** (Reversepolishnotation/)
- **Time**: O(n)
- **Space**: O(n)
- **Problem**: Evaluate postfix expressions
- **Operators**: +, -, *, /
- **Example**: ["2","1","+","3","*"] → 9

#### 6. **Online Stock Span** (online stock span.java)
- **Time**: O(n) amortized
- **Space**: O(n)
- **Problem**: Days since price ≤ current
- **Approach**: Monotonic decreasing stack
- **Example**: [100,80,60,70,60,75,85] → [1,1,1,2,1,4,6]

#### 7. **Daily Temperatures** (temparatues.java)
- **Time**: O(n)
- **Space**: O(n)
- **Problem**: Days until warmer temperature
- **Approach**: Monotonic stack
- **Example**: [73,74,75,71,69,72,76,73] → [1,1,4,2,1,1,0,0]

#### 8. **Additional Problems**
- Reverse K Groups
- Letter Case Permutation
- NGE variants
- And more!

---

## 🔧 Queue Problems

### **Queue Implementations & Applications**

#### 1. **Basic Queue** (Queue.java)
- **Type**: Linked list based
- **Time**: O(1) for enqueue/dequeue
- **Space**: O(n)
- **Operations**: enqueue, dequeue, isEmpty, display

#### 2. **Queue Using Arrays** (Queuebyarrays.java)
- **Type**: Circular array
- **Time**: O(1) amortized
- **Space**: O(capacity)
- **Advantage**: Cache friendly

#### 3. **Queue Using Stacks** (Queuesbystack.java)
- **Time**: O(n) amortized
- **Space**: O(n)
- **Approach**: 2-stack solution
- **Symmetry**: Queue-Stack duality

#### 4. **Ticket System** (tickets/)
- **Application**: Practical queue usage
- **Time**: O(1) per operation
- **Use Case**: Ticket queue management

---

## 📊 Problem Summary Table

| # | Problem | Category | Difficulty | Time | Space | Approach |
|---|---------|----------|-----------|------|-------|----------|
| 1 | Stack Implementation | Fundamentals | Easy | O(1) | O(n) | Array |
| 2 | Stack by LL | Fundamentals | Easy | O(1) | O(n) | Linked List |
| 3 | Stack by Queue | Fundamentals | Medium | O(n) | O(n) | Queue |
| 4 | Valid Parenthesis | Fundamentals | Easy | O(n) | O(n) | Stack |
| 5 | Min Stack | Fundamentals | Medium | O(1) | O(n) | Dual Stack |
| 6 | Infix to Postfix | Expression | Medium | O(n) | O(n) | Precedence |
| 7 | Postfix to Infix | Expression | Medium | O(n) | O(n) | Stack |
| 8 | Postfix to Prefix | Expression | Medium | O(n) | O(n) | 2 Stack |
| 9 | Prefix to Infix | Expression | Medium | O(n) | O(n) | RTL |
| 10 | Prefix to Postfix | Expression | Medium | O(n) | O(n) | Stack |
| 11 | Next Greater Element | Advanced | Medium | O(n) | O(n) | Monotonic |
| 12 | Circular Next Greater | Advanced | Hard | O(n) | O(n) | Circular |
| 13 | Next Smallest | Advanced | Medium | O(n) | O(n) | Monotonic |
| 14 | Asteroid Collision | Advanced | Hard | O(n) | O(n) | Simulation |
| 15 | Reverse Polish Notation | Advanced | Medium | O(n) | O(n) | Stack |
| 16 | Online Stock Span | Advanced | Medium | O(n) | O(n) | Monotonic |
| 17 | Daily Temperatures | Advanced | Medium | O(n) | O(n) | Monotonic |
| 18 | Queue Implementation | Queue | Easy | O(1) | O(n) | LL |
| 19 | Queue by Arrays | Queue | Medium | O(1) | O(n) | Circular |
| 20 | Queue by Stacks | Queue | Medium | O(n) | O(n) | 2 Stack |
| 21 | Ticket System | Queue | Easy | O(1) | O(n) | Queue |

---

## 🎓 Stack Concepts Covered

### 1. Implementation
- Array-based stack
- Linked list-based stack
- Hybrid approaches (stack using queue)

### 2. Applications
- Expression evaluation and conversion
- Bracket matching and validation
- Backtracking (recursion simulation)
- Undo/Redo operations
- DFS traversal

### 3. Advanced Techniques
- **Monotonic Stack**: Find next greater/smaller
- **Stack with Auxiliary**: Min/Max queries
- **Dual Stack**: Output queue from stack
- **Expression Parsing**: Prefix, infix, postfix

### 4. Problem Solving Patterns
- Using stack for recursion
- Stack for parenthesis matching
- Monotonic properties
- Collision detection

---

## 🔄 Queue Concepts Covered

### 1. Implementation
- Array-based circular queue
- Linked list-based queue
- Hybrid approaches (queue using stacks)

### 2. Applications
- BFS traversal
- Level-order traversal
- Task scheduling
- Asynchronous processing
- Load balancing

### 3. Advanced Techniques
- Deque (Double-ended queue)
- Priority queue
- Queue optimization
- Sliding window

---

## 🧮 Complexity Analysis

### Stack Operations
```
Push        | O(1)  | Add element to top
Pop         | O(1)  | Remove top element
Peek/Top    | O(1)  | View top element
isEmpty     | O(1)  | Check if empty
Search      | O(n)  | Linear search
```

### Queue Operations
```
Enqueue     | O(1)  | Add to rear
Dequeue     | O(1)  | Remove from front
Front/Rear  | O(1)  | Access ends
isEmpty     | O(1)  | Check if empty
Search      | O(n)  | Linear search
```

### Problem Complexities
```
Expression Conversion  | O(n) time, O(n) space
Next Greater Element   | O(n) time, O(n) space (optimal)
Valid Parenthesis      | O(n) time, O(n) space
Min Stack              | O(1) time, O(n) space
Daily Temperatures    | O(n) time, O(n) space
```

---

## 💡 Key Algorithms & Patterns

### 1. Monotonic Stack
```java
// Used for: Next Greater/Smaller, Stock Span, Daily Temps
Stack<Integer> st;
for (int i = n - 1; i >= 0; i--) {
    while (!st.isEmpty() && st.peek() <= arr[i])
        st.pop();
    result[i] = st.isEmpty() ? -1 : st.peek();
    st.push(arr[i]);
}
```

### 2. Expression Precedence
```java
// Operator precedence for conversions
private static int precedence(char op) {
    if (op == '+' || op == '-') return 1;
    if (op == '*' || op == '/') return 2;
    if (op == '^') return 3;
    return 0;
}
```

### 3. Bracket Matching
```java
// Check balanced parenthesis
Stack<Character> st = new Stack<>();
for (char ch : s.toCharArray()) {
    if (ch == '(' || ch == '[' || ch == '{') {
        st.push(ch);
    } else {
        if (st.isEmpty() || !matches(st.pop(), ch))
            return false;
    }
}
return st.isEmpty();
```

### 4. Min Stack Dual Stack
```java
// O(1) getMin() with dual stack
Stack<Integer> st, minSt;
void push(int x) {
    st.push(x);
    minSt.push(Math.min(x, minSt.peek()));
}
int getMin() {
    return minSt.peek();
}
```

### 5. Queue from Stacks
```java
// 2-stack solution: one for input, one for output
Stack<Integer> input = new Stack<>();
Stack<Integer> output = new Stack<>();
void enqueue(int x) {
    input.push(x);
}
int dequeue() {
    if (output.isEmpty())
        while (!input.isEmpty())
            output.push(input.pop());
    return output.pop();
}
```

---

## 🔗 Problem Interconnections

```
Stack Fundamentals (Lecture-1)
       ↓
Expression Conversion (Lecture-2)
       ↓
Advanced Stack Algorithms (Lecture-3)
       ├── Monotonic Stack Pattern
       ├── Collision Detection
       └── Complex Scenarios
       
Queue Fundamentals (Lecture-1)
       ├── Array Implementation
       ├── Stack Implementation
       └── Real-world Applications
```

---

## 📈 Learning Path

### Beginner (0-5 hrs)
1. Stack basics: push, pop, peek
2. Queue basics: enqueue, dequeue
3. Valid parenthesis problem
4. Basic stack/queue implementation

### Intermediate (5-15 hrs)
- Expression conversion (all 5 types)
- Next greater element
- Min stack
- Queue implementations
- Daily temperatures
- Online stock span

### Advanced (15-30 hrs)
- Asteroid collision
- Circular arrays
- Reverse Polish notation
- Complex nested structures
- Optimization patterns
- Real-world applications

---

## 🚀 Compilation & Execution

### Compile
```bash
# Single file
javac Stack/Lecture-1/Validparanthesis.java

# All files
javac Stack/**/*.java
javac Queue/**/*.java
```

### Run
```bash
# Run specific problem
java Stack.Lecture-1.Validparanthesis

# Run test suite
java Solution
```

---

## 🎯 Interview Preparation

### Frequently Asked
1. **Valid Parenthesis** - Must know (Easy)
2. **Min Stack** - Common (Medium)
3. **Next Greater Element** - Pattern (Medium)
4. **Daily Temperatures** - Variations (Medium)
5. **Expression Conversion** - Theory (Medium)

### Pattern Recognition
- Stack for matching problems
- Queue for ordering problems
- Monotonic stack for "next/previous"
- Expression parsing for calculation

### Optimization Techniques
- Brute force to optimal conversion
- Space optimization
- Time complexity reduction
- Data structure switching

---

## 🌟 Best Practices

### Stack Usage
✅ Use stack for recursive-like problems  
✅ Monotonic stack for next/previous patterns  
✅ Dual stack for min/max queries  
✅ Stack for DFS and backtracking  

### Queue Usage
✅ Use queue for ordering problems  
✅ Queue for level-order traversals  
✅ Queue for scheduling/buffering  
✅ Deque for sliding window  

### Code Quality
✅ Handle empty edge cases  
✅ Type-safe implementations  
✅ Clear variable names  
✅ Time/space comments  

---

## 📚 Resources

### Internal References
- **Lecture-1**: Foundation - Start here
- **Lecture-2**: Build on fundamentals
- **Lecture-3**: Advanced patterns
- **Additional**: Real-world problems

### External Resources
- LeetCode Stack Problems
- LeetCode Queue Problems
- GeeksforGeeks Stack/Queue
- Interview bit DSA Patterns

---

## 🧪 Test Cases & Edge Cases

### Stack Problems
```
Empty stack operations
Single element
Duplicate elements
All opening brackets
All closing brackets
Nested structures
Mixed types
Large inputs
```

### Queue Problems
```
Empty queue operations
Single element
Sequential operations
Circular edge cases
Capacity limits
Alternating enqueue/dequeue
```

---

## 📊 File Statistics

| Category | Files | LOC | Problems |
|----------|-------|-----|----------|
| Lecture-1 | 5 | ~400 | 5 |
| Lecture-2 | 5 | ~300 | 5 |
| Lecture-3 | 8+ | ~600+ | 8+ |
| Queue | 4+ | ~300+ | 4+ |
| Misc | 2 | ~100 | 2 |
| **Total** | **24+** | **1700+** | **24+** |

---

## 🎓 Learning Objectives

After working through this repository, you will understand:

✅ Stack and queue fundamentals  
✅ Multiple implementations  
✅ Expression parsing and conversion  
✅ Monotonic stack pattern  
✅ Bracket matching algorithms  
✅ Real-world applications  
✅ Optimization techniques  
✅ Interview problem patterns  

---

## 💬 FAQ

**Q: Why are there multiple implementations?**  
A: To show array-based, linked list-based, and hybrid approaches with trade-offs.

**Q: What's monotonic stack?**  
A: A stack that maintains elements in increasing/decreasing order for efficiency.

**Q: How do I choose between stack and queue?**  
A: Stack (LIFO) for reversal, Queue (FIFO) for ordering and scheduling.

**Q: Are these solutions optimal?**  
A: Most show both brute force and optimal solutions for learning.

**Q: Can I use these for interviews?**  
A: Yes! These cover common patterns tested by FAANG companies.

---

## 🏆 Key Takeaways

1. **Fundamentals Matter**: Master basic push/pop before advanced problems
2. **Pattern Recognition**: Many problems use similar techniques (monotonic stack)
3. **Multiple Solutions**: Always explore brute force then optimize
4. **Implementation Matters**: Array vs LL has different trade-offs
5. **Practice Variations**: Once you learn a pattern, try variations

---

## 📞 Repository Info

**Owner**: [Rakesh](https://github.com/rakeshkolipakaace)  
**Repository**: Stack-dsa  
**Type**: Educational DSA Collection  
**Language**: Java (100%)  
**Total Problems**: 24+ complete solutions  
**Status**: Production-ready for learning  
**Last Updated**: 2024

---

## 🏷️ Keywords

Stack, Queue, Data Structures, Algorithms, DSA, Java, Problem Solving, Interview Preparation, Expression Conversion, Monotonic Stack, Next Greater Element, Valid Parenthesis, Min Stack, Queue Implementation, Bracket Matching, Competitive Programming, LeetCode, Optimal Solutions

---

## 🎉 Summary

This repository provides:

✅ **25+ Complete Problems** with multiple solutions  
✅ **All Implementations** - Array, LL, and Hybrid  
✅ **Expression Conversions** - All 5 types covered  
✅ **Advanced Patterns** - Monotonic stacks, collisions  
✅ **Optimal Algorithms** - O(n) solutions highlighted  
✅ **Interview Ready** - Common pattern problems  
✅ **Well-Organized** - 3 lectures progressing in difficulty  
✅ **Complexity Analysis** - Time/space for each solution  

Perfect for mastering stack and queue problems!

---

**Repository Status**: ✅ Complete | **Quality**: ✅ Production-Ready  
**Problem Count**: 24+ | **Languages**: Java 100%  
**Difficulty Range**: Beginner → Advanced | **Use Cases**: Learning, Interviews, Competitive Programming  
**Time to Master**: 20-30 hours | **Recommended Flow**: Lecture-1 → Lecture-2 → Lecture-3
