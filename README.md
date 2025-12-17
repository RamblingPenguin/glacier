# Glacier

Glacier is a lightweight Java library that provides a set of standard interfaces and contracts for building modular, manageable, and observable software components. It focuses on defining common patterns for lifecycle management, state observation, and object traits.

## Requirements

*   Java 25 or higher

## Installation

To use Glacier in your Maven project, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.ramblingpenguin</groupId>
    <artifactId>glacier</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Features

Glacier is organized into several key packages, each addressing a specific architectural concern:

### Lifecycle Management (`com.ramblingpenguin.glacier.lifecycle`)
Standard interfaces for managing the state of your components.
*   **Initializable**: For components that require setup before use.
*   **Startable / Stoppable**: For components with an active runtime phase.
*   **Pausable**: For components that can temporarily suspend operations.
*   **Reloadable**: For components that can refresh their configuration or state at runtime.
*   **ForceStoppable**: For immediate shutdown capabilities.
*   **Configurable**: For components that accept configuration objects.

### Observability (`com.ramblingpenguin.glacier.observe`)
Basic building blocks for the Observer pattern.
*   **Observable**: Interface for objects that allow listeners to be attached and detached.
*   **Listener**: Marker interface for event listeners.

### Health & Probes (`com.ramblingpenguin.glacier.probe`)
Interfaces for monitoring component health and readiness.
*   **ReadyProbe**: Checks if a component is ready to accept work.
*   **StatusProbe**: General interface for checking component status.

### Traits (`com.ramblingpenguin.glacier.trait`)
Common characteristics for domain objects.
*   **Identifiable**: For objects that have a unique ID.
*   **Named**: For objects that have a human-readable name.

### Functional Utilities (`com.ramblingpenguin.glacier.function`)
Functional interfaces that support checked exceptions.
*   **RunnableWithException**: A `Runnable` that can throw an exception.
*   **SupplierWithException**: A `Supplier` that can throw an exception.

## Usage

Glacier interfaces are designed to be implemented by your application's core components to ensure consistency.

**Example: A Lifecycle Component**

```java
import com.ramblingpenguin.glacier.lifecycle.Startable;
import com.ramblingpenguin.glacier.lifecycle.Stoppable;

public class MyService implements Startable, Stoppable {

    @Override
    public void start() throws Exception {
        System.out.println("Service starting...");
        // Initialization logic
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Service stopping...");
        // Cleanup logic
    }
}
```

## License

[MIT License](LICENSE)
