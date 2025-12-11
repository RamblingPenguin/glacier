# AGENTS.md - Glacier

## Project Overview
**Glacier** is a Java utility library designed to provide foundational elements and abstractions that are missing from the standard JDK. It aims to offer standardized interfaces and utilities for common software engineering patterns, such as lifecycle management and health probing.

## Technology Stack
- **Language:** Java 25
- **Build System:** Maven
- **Group ID:** `com.ramblingpenguin`
- **Artifact ID:** `glacier`

## Code Structure & Philosophy
The library is organized into packages by functionality. The base package is `com.ramblingpenguin.glacier`.

### 1. Lifecycle (`com.ramblingpenguin.glacier.lifecycle`)
Standardizes the application or component lifecycle.
- **`Initializable<CONTEXT>`**: For components requiring initialization with a specific context.
- **`Configurable<CONFIG>`**: For components that accept a configuration object.
- **`Startable`**: For components that need to be started.
- **`Stoppable`**: For components that need to be stopped.
- **`ForceStoppable`**: Extends `Stoppable` to allow forceful termination.
- **`Pausable`**: For components that can be temporarily paused and resumed.
- **`Reloadable`**: For components that can reload their configuration or state.

### 2. Probe (`com.ramblingpenguin.glacier.probe`)
Standardizes health and readiness checks.
- **`ReadyProbe`**: Returns a boolean indicating if a component is ready to accept work.
- **`StatusProbe<STATUS>`**: Returns a typed status object for the component.

### 3. Trait (`com.ramblingpenguin.glacier.trait`)
Standardizes common object traits.
- **`Identifiable<ID>`**: For components that can be identified by an ID.
- **`Named`**: For components that have a name.

### 4. Observe (`com.ramblingpenguin.glacier.observe`)
Standardizes the observer pattern.
- **`Listener<EVENT>`**: A generic event listener.
- **`Observable<LISTENER>`**: For components that manage a set of listeners.

### 5. Function (`com.ramblingpenguin.glacier.function`)
Utilities for functional programming.
- **`RunnableWithException`**: A `Runnable` that can throw checked exceptions.
- **`SupplierWithException<T>`**: A `Supplier` that can throw checked exceptions.

## Coding Conventions
- **Simplicity:** Interfaces should be single-purpose and minimal.
- **Exception Handling:** Lifecycle methods generally throw `Exception` to allow implementers flexibility in failure reporting.
- **Generics:** Use generics to allow typed contexts (e.g., `Initializable<CONTEXT>`) or return types (e.g., `HealthyProbe<HEALTH>`) rather than `Object`.
- **JDK Version:** Utilize Java 25 features where applicable.

## Directives for AI Agents
1. **Philosophy:** When adding new features, ask "Is this a foundational element missing from the JDK?"
2. **Consistency:** Ensure new interfaces match the existing naming patterns and package structure.
3. **Testing:** Create unit tests for any new concrete implementations (currently only interfaces exist).
