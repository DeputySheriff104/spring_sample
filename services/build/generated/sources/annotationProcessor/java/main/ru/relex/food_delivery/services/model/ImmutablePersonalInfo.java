package ru.relex.food_delivery.services.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;
import org.springframework.lang.Nullable;

/**
 * Immutable implementation of {@link PersonalInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePersonalInfo.builder()}.
 */
@Generated(from = "PersonalInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePersonalInfo implements PersonalInfo {
  private final String firstName;
  private final String lastName;
  private final String email;
  private final @Nullable String phone;

  private ImmutablePersonalInfo(
      String firstName,
      String lastName,
      String email,
      @Nullable String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
  }

  /**
   * @return The value of the {@code firstName} attribute
   */
  @JsonProperty("firstName")
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The value of the {@code lastName} attribute
   */
  @JsonProperty("lastName")
  @Override
  public String getLastName() {
    return lastName;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @JsonProperty("email")
  @Override
  public String getEmail() {
    return email;
  }

  /**
   * @return The value of the {@code phone} attribute
   */
  @JsonProperty("phone")
  @Override
  public @Nullable String getPhone() {
    return phone;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonalInfo#getFirstName() firstName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for firstName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonalInfo withFirstName(String value) {
    String newValue = Objects.requireNonNull(value, "firstName");
    if (this.firstName.equals(newValue)) return this;
    return new ImmutablePersonalInfo(newValue, this.lastName, this.email, this.phone);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonalInfo#getLastName() lastName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonalInfo withLastName(String value) {
    String newValue = Objects.requireNonNull(value, "lastName");
    if (this.lastName.equals(newValue)) return this;
    return new ImmutablePersonalInfo(this.firstName, newValue, this.email, this.phone);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonalInfo#getEmail() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonalInfo withEmail(String value) {
    String newValue = Objects.requireNonNull(value, "email");
    if (this.email.equals(newValue)) return this;
    return new ImmutablePersonalInfo(this.firstName, this.lastName, newValue, this.phone);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonalInfo#getPhone() phone} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for phone (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonalInfo withPhone(@Nullable String value) {
    if (Objects.equals(this.phone, value)) return this;
    return new ImmutablePersonalInfo(this.firstName, this.lastName, this.email, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePersonalInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePersonalInfo
        && equalTo((ImmutablePersonalInfo) another);
  }

  private boolean equalTo(ImmutablePersonalInfo another) {
    return firstName.equals(another.firstName)
        && lastName.equals(another.lastName)
        && email.equals(another.email)
        && Objects.equals(phone, another.phone);
  }

  /**
   * Computes a hash code from attributes: {@code firstName}, {@code lastName}, {@code email}, {@code phone}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + firstName.hashCode();
    h += (h << 5) + lastName.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(phone);
    return h;
  }

  /**
   * Prints the immutable value {@code PersonalInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PersonalInfo{"
        + "firstName=" + firstName
        + ", lastName=" + lastName
        + ", email=" + email
        + ", phone=" + phone
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link PersonalInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PersonalInfo instance
   */
  public static ImmutablePersonalInfo copyOf(PersonalInfo instance) {
    if (instance instanceof ImmutablePersonalInfo) {
      return (ImmutablePersonalInfo) instance;
    }
    return ImmutablePersonalInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePersonalInfo ImmutablePersonalInfo}.
   * <pre>
   * ImmutablePersonalInfo.builder()
   *    .firstName(String) // required {@link PersonalInfo#getFirstName() firstName}
   *    .lastName(String) // required {@link PersonalInfo#getLastName() lastName}
   *    .email(String) // required {@link PersonalInfo#getEmail() email}
   *    .phone(String | null) // nullable {@link PersonalInfo#getPhone() phone}
   *    .build();
   * </pre>
   * @return A new ImmutablePersonalInfo builder
   */
  public static ImmutablePersonalInfo.Builder builder() {
    return new ImmutablePersonalInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePersonalInfo ImmutablePersonalInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PersonalInfo", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FIRST_NAME = 0x1L;
    private static final long INIT_BIT_LAST_NAME = 0x2L;
    private static final long INIT_BIT_EMAIL = 0x4L;
    private long initBits = 0x7L;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PersonalInfo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PersonalInfo instance) {
      Objects.requireNonNull(instance, "instance");
      firstName(instance.getFirstName());
      lastName(instance.getLastName());
      email(instance.getEmail());
      String phoneValue = instance.getPhone();
      if (phoneValue != null) {
        phone(phoneValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PersonalInfo#getFirstName() firstName} attribute.
     * @param firstName The value for firstName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("firstName")
    public final Builder firstName(String firstName) {
      this.firstName = Objects.requireNonNull(firstName, "firstName");
      initBits &= ~INIT_BIT_FIRST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PersonalInfo#getLastName() lastName} attribute.
     * @param lastName The value for lastName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastName")
    public final Builder lastName(String lastName) {
      this.lastName = Objects.requireNonNull(lastName, "lastName");
      initBits &= ~INIT_BIT_LAST_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PersonalInfo#getEmail() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("email")
    public final Builder email(String email) {
      this.email = Objects.requireNonNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link PersonalInfo#getPhone() phone} attribute.
     * @param phone The value for phone (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("phone")
    public final Builder phone(@Nullable String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePersonalInfo ImmutablePersonalInfo}.
     * @return An immutable instance of PersonalInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePersonalInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePersonalInfo(firstName, lastName, email, phone);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FIRST_NAME) != 0) attributes.add("firstName");
      if ((initBits & INIT_BIT_LAST_NAME) != 0) attributes.add("lastName");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      return "Cannot build PersonalInfo, some of required attributes are not set " + attributes;
    }
  }
}
