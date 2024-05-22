# Getting Started

### Java Bean Validation API Overview

1. In java, the **java Bean Validation API** has become the de-facto standard for handling validation in java project.
2. Hibernate Validator is the reference implementation of the validation API.

### Important Bean Validation Annotations

1. **@NotNull** validates that the annotated property value is not null.
2. **@Size** Validates the annotated property value has a size between the attributes min and max; can be applied to String, Collection, Map, and array Properties.
3. **@Min** Validates that the annotated property has a value not smaller then the value attribute.
4. **@Max** validates that the annotated property has a value no larger the value attribute.
5. **@Email** validates that thee annotated proerty is a valid email address.
6. **@NotBlank** can be applied only to text values and validates that the propertyy is not null or whitespace.

### Validation in Spring Boot App

1. Spring Boot provides good integration with Hibernate validator for validating REST API requestes
2. We will use Hibernate validator which is reference implementation of Java bean validation APi
3. Adding validation is Spring boot app is super easy. we just have to add **spring-boot-starter-validation** dependency.

### Development Steps

1. Add Validation Dependency
2. Add Validation Annotation to userDto
3. Enable Validation using @Valid Annotation on Create and Update REST APIs
4. Customize Validation Error Response and Send Back to Client