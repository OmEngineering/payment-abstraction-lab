# Payment Abstraction Lab

A small Java project focused on learning **abstraction, polymorphism, inheritance, interfaces, and SOLID principles** through a simplified payment-processing domain.

The goal is not to build a real payment gateway, but to understand how payment systems can be modeled using clean object-oriented design.

## 🎯 Purpose

This project explores questions such as:

* How should a payment system be abstracted?
* When should we use an `abstract class` vs an `interface`?
* How can different payment methods provide their own implementation?
* How does polymorphism help us avoid tightly coupled code?
* How can SOLID principles improve the design?
* How can we add a new payment method without modifying existing code?

## 🏗️ Current Concept

The project models different payment methods and their processing behavior.

For example:

```text
Payment
   │
   ├── CreditCard
   │      ├── Visa
   │      └── MasterCard
   │
   ├── DebitCard
   │
   └── ...
```

Each implementation can provide its own payment-processing behavior while the higher-level code works with the abstraction rather than a concrete implementation.

## 🧠 Concepts Practiced

### Abstraction

Hide implementation details behind a common contract.

```java
abstract class Payment {

    public abstract void pay(double amount);
}
```

### Inheritance

Specialized payment types can extend a common abstraction.

```java
class Visa extends CreditCard {

    @Override
    public void pay(double amount) {
        // Visa-specific implementation
    }
}
```

### Polymorphism

The payment processor can work with the abstraction:

```java
Payment payment = new Visa();

payment.pay(100.00);
```

The actual implementation is determined at runtime.

### Encapsulation

Payment-specific implementation details remain inside the appropriate class instead of leaking into the payment processor.

### SOLID Principles

The project will gradually explore:

* **S — Single Responsibility Principle**
* **O — Open/Closed Principle**
* **L — Liskov Substitution Principle**
* **I — Interface Segregation Principle**
* **D — Dependency Inversion Principle**

## 💳 Payment Domain

The project may contain simplified implementations such as:

```text
Payment
├── CreditCard
│   ├── Visa
│   └── MasterCard
├── DebitCard
└── UPI
```

These are **educational abstractions only**.

No real credit-card information, payment credentials, or financial transactions are processed.

## 🚀 Future Improvements

The project can gradually evolve to explore more realistic design problems:

* Payment validation
* Payment status
* Payment failures
* Custom exceptions
* Refunds
* Transaction IDs
* Payment strategies
* Payment gateways
* Dependency injection
* Interfaces vs abstract classes
* Unit testing
* Design patterns
* Better domain modeling

## 🧪 Example Usage

A payment processor should ideally depend on an abstraction:

```java
Payment payment = new Visa();

PaymentProcessor processor = new PaymentProcessor(payment);

processor.process(500.00);
```

The processor should not need to know whether the payment is Visa, MasterCard, UPI, or another supported implementation.

## 🛠️ Tech Stack

* Java
* Maven
* JUnit
* IntelliJ IDEA

## 📚 Learning Goal

The primary goal of this repository is **not complexity**.

It is to take a simple domain and repeatedly ask:

> **"Can this design change without forcing unrelated code to change?"**

The project will be evolved incrementally as new OOP and SOLID concepts are learned.

## ⚠️ Disclaimer

This is an educational project.

It does **not** implement real payment processing and should not be used to handle actual payment information or financial transactions.

## 📌 Status

🚧 **Learning / In Progress**

The design will evolve as new abstraction, OOP, and SOLID concepts are explored.
