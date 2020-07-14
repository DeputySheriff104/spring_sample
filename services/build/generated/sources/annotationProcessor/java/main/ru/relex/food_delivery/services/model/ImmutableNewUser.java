package ru.relex.food_delivery.services.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link NewUser}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNewUser.builder()}.
 */
@Generated(from = "NewUser", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableNewUser implements NewUser {
  private final Role role;
  private final PersonalInfo personalInfo;
  private final String userName;
  private final String password;

  private ImmutableNewUser(
      Role role,
      PersonalInfo personalInfo,
      String userName,
      String password) {
    this.role = role;
    this.personalInfo = personalInfo;
    this.userName = userName;
    this.password = password;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Role getRole() {
    return role;
  }

  /**
   * @return The value of the {@code personalInfo} attribute
   */
  @JsonProperty("personalInfo")
  @Override
  public PersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  /**
   * @return The value of the {@code userName} attribute
   */
  @JsonProperty("userName")
  @Override
  public String getUserName() {
    return userName;
  }

  /**
   * @return The value of the {@code password} attribute
   */
  @JsonProperty("password")
  @Override
  public String getPassword() {
    return password;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NewUser#getRole() role} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNewUser withRole(Role value) {
    if (this.role == value) return this;
    Role newValue = Objects.requireNonNull(value, "role");
    if (this.role.equals(newValue)) return this;
    return new ImmutableNewUser(newValue, this.personalInfo, this.userName, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NewUser#getPersonalInfo() personalInfo} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personalInfo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNewUser withPersonalInfo(PersonalInfo value) {
    if (this.personalInfo == value) return this;
    PersonalInfo newValue = Objects.requireNonNull(value, "personalInfo");
    return new ImmutableNewUser(this.role, newValue, this.userName, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NewUser#getUserName() userName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNewUser withUserName(String value) {
    String newValue = Objects.requireNonNull(value, "userName");
    if (this.userName.equals(newValue)) return this;
    return new ImmutableNewUser(this.role, this.personalInfo, newValue, this.password);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NewUser#getPassword() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNewUser withPassword(String value) {
    String newValue = Objects.requireNonNull(value, "password");
    if (this.password.equals(newValue)) return this;
    return new ImmutableNewUser(this.role, this.personalInfo, this.userName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNewUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNewUser
        && equalTo((ImmutableNewUser) another);
  }

  private boolean equalTo(ImmutableNewUser another) {
    return role.equals(another.role)
        && personalInfo.equals(another.personalInfo)
        && userName.equals(another.userName)
        && password.equals(another.password);
  }

  /**
   * Computes a hash code from attributes: {@code role}, {@code personalInfo}, {@code userName}, {@code password}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + role.hashCode();
    h += (h << 5) + personalInfo.hashCode();
    h += (h << 5) + userName.hashCode();
    h += (h << 5) + password.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code NewUser} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "NewUser{"
        + "role=" + role
        + ", personalInfo=" + personalInfo
        + ", userName=" + userName
        + ", password=" + "*****"
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link NewUser} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NewUser instance
   */
  public static ImmutableNewUser copyOf(NewUser instance) {
    if (instance instanceof ImmutableNewUser) {
      return (ImmutableNewUser) instance;
    }
    return ImmutableNewUser.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNewUser ImmutableNewUser}.
   * <pre>
   * ImmutableNewUser.builder()
   *    .role(ru.relex.food_delivery.services.model.Role) // required {@link NewUser#getRole() role}
   *    .personalInfo(ru.relex.food_delivery.services.model.PersonalInfo) // required {@link NewUser#getPersonalInfo() personalInfo}
   *    .userName(String) // required {@link NewUser#getUserName() userName}
   *    .password(String) // required {@link NewUser#getPassword() password}
   *    .build();
   * </pre>
   * @return A new ImmutableNewUser builder
   */
  public static ImmutableNewUser.Builder builder() {
    return new ImmutableNewUser.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNewUser ImmutableNewUser}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NewUser", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ROLE = 0x1L;
    private static final long INIT_BIT_PERSONAL_INFO = 0x2L;
    private static final long INIT_BIT_USER_NAME = 0x4L;
    private static final long INIT_BIT_PASSWORD = 0x8L;
    private long initBits = 0xfL;

    private Role role;
    private PersonalInfo personalInfo;
    private String userName;
    private String password;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ru.relex.food_delivery.services.model.BaseUser} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BaseUser instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code ru.relex.food_delivery.services.model.NewUser} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NewUser instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof BaseUser) {
        BaseUser instance = (BaseUser) object;
        userName(instance.getUserName());
        personalInfo(instance.getPersonalInfo());
        role(instance.getRole());
      }
      if (object instanceof NewUser) {
        NewUser instance = (NewUser) object;
        password(instance.getPassword());
      }
    }

    /**
     * Initializes the value for the {@link NewUser#getRole() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Role role) {
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the value for the {@link NewUser#getPersonalInfo() personalInfo} attribute.
     * @param personalInfo The value for personalInfo 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("personalInfo")
    public final Builder personalInfo(PersonalInfo personalInfo) {
      this.personalInfo = Objects.requireNonNull(personalInfo, "personalInfo");
      initBits &= ~INIT_BIT_PERSONAL_INFO;
      return this;
    }

    /**
     * Initializes the value for the {@link NewUser#getUserName() userName} attribute.
     * @param userName The value for userName 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userName")
    public final Builder userName(String userName) {
      this.userName = Objects.requireNonNull(userName, "userName");
      initBits &= ~INIT_BIT_USER_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link NewUser#getPassword() password} attribute.
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("password")
    public final Builder password(String password) {
      this.password = Objects.requireNonNull(password, "password");
      initBits &= ~INIT_BIT_PASSWORD;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNewUser ImmutableNewUser}.
     * @return An immutable instance of NewUser
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNewUser build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableNewUser(role, personalInfo, userName, password);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ROLE) != 0) attributes.add("role");
      if ((initBits & INIT_BIT_PERSONAL_INFO) != 0) attributes.add("personalInfo");
      if ((initBits & INIT_BIT_USER_NAME) != 0) attributes.add("userName");
      if ((initBits & INIT_BIT_PASSWORD) != 0) attributes.add("password");
      return "Cannot build NewUser, some of required attributes are not set " + attributes;
    }
  }
}
