package ru.relex.food_delivery.services.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ExistingUser}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExistingUser.builder()}.
 */
@Generated(from = "ExistingUser", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableExistingUser implements ExistingUser {
  private final Role role;
  private final PersonalInfo personalInfo;
  private final String userName;
  private final long id;
  private final UserStatus status;

  private ImmutableExistingUser(
      Role role,
      PersonalInfo personalInfo,
      String userName,
      long id,
      UserStatus status) {
    this.role = role;
    this.personalInfo = personalInfo;
    this.userName = userName;
    this.id = id;
    this.status = status;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @Override
  public Role getRole() {
    return role;
  }

  /**
   * @return The value of the {@code personalInfo} attribute
   */
  @Override
  public PersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  /**
   * @return The value of the {@code userName} attribute
   */
  @Override
  public String getUserName() {
    return userName;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public long getId() {
    return id;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @Override
  public UserStatus getStatus() {
    return status;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExistingUser#getRole() role} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExistingUser withRole(Role value) {
    if (this.role == value) return this;
    Role newValue = Objects.requireNonNull(value, "role");
    if (this.role.equals(newValue)) return this;
    return new ImmutableExistingUser(newValue, this.personalInfo, this.userName, this.id, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExistingUser#getPersonalInfo() personalInfo} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personalInfo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExistingUser withPersonalInfo(PersonalInfo value) {
    if (this.personalInfo == value) return this;
    PersonalInfo newValue = Objects.requireNonNull(value, "personalInfo");
    return new ImmutableExistingUser(this.role, newValue, this.userName, this.id, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExistingUser#getUserName() userName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExistingUser withUserName(String value) {
    String newValue = Objects.requireNonNull(value, "userName");
    if (this.userName.equals(newValue)) return this;
    return new ImmutableExistingUser(this.role, this.personalInfo, newValue, this.id, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExistingUser#getId() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExistingUser withId(long value) {
    if (this.id == value) return this;
    return new ImmutableExistingUser(this.role, this.personalInfo, this.userName, value, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExistingUser#getStatus() status} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExistingUser withStatus(UserStatus value) {
    if (this.status == value) return this;
    UserStatus newValue = Objects.requireNonNull(value, "status");
    return new ImmutableExistingUser(this.role, this.personalInfo, this.userName, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExistingUser} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExistingUser
        && equalTo((ImmutableExistingUser) another);
  }

  private boolean equalTo(ImmutableExistingUser another) {
    return role.equals(another.role)
        && personalInfo.equals(another.personalInfo)
        && userName.equals(another.userName)
        && id == another.id
        && status.equals(another.status);
  }

  /**
   * Computes a hash code from attributes: {@code role}, {@code personalInfo}, {@code userName}, {@code id}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + role.hashCode();
    h += (h << 5) + personalInfo.hashCode();
    h += (h << 5) + userName.hashCode();
    h += (h << 5) + Long.hashCode(id);
    h += (h << 5) + status.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ExistingUser} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ExistingUser{"
        + "role=" + role
        + ", personalInfo=" + personalInfo
        + ", userName=" + userName
        + ", id=" + id
        + ", status=" + status
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link ExistingUser} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExistingUser instance
   */
  public static ImmutableExistingUser copyOf(ExistingUser instance) {
    if (instance instanceof ImmutableExistingUser) {
      return (ImmutableExistingUser) instance;
    }
    return ImmutableExistingUser.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableExistingUser ImmutableExistingUser}.
   * <pre>
   * ImmutableExistingUser.builder()
   *    .role(ru.relex.food_delivery.services.model.Role) // required {@link ExistingUser#getRole() role}
   *    .personalInfo(ru.relex.food_delivery.services.model.PersonalInfo) // required {@link ExistingUser#getPersonalInfo() personalInfo}
   *    .userName(String) // required {@link ExistingUser#getUserName() userName}
   *    .id(long) // required {@link ExistingUser#getId() id}
   *    .status(ru.relex.food_delivery.services.model.UserStatus) // required {@link ExistingUser#getStatus() status}
   *    .build();
   * </pre>
   * @return A new ImmutableExistingUser builder
   */
  public static ImmutableExistingUser.Builder builder() {
    return new ImmutableExistingUser.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableExistingUser ImmutableExistingUser}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExistingUser", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ROLE = 0x1L;
    private static final long INIT_BIT_PERSONAL_INFO = 0x2L;
    private static final long INIT_BIT_USER_NAME = 0x4L;
    private static final long INIT_BIT_ID = 0x8L;
    private static final long INIT_BIT_STATUS = 0x10L;
    private long initBits = 0x1fL;

    private Role role;
    private PersonalInfo personalInfo;
    private String userName;
    private long id;
    private UserStatus status;

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
     * Fill a builder with attribute values from the provided {@code ru.relex.food_delivery.services.model.ExistingUser} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ExistingUser instance) {
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
      if (object instanceof ExistingUser) {
        ExistingUser instance = (ExistingUser) object;
        id(instance.getId());
        status(instance.getStatus());
      }
    }

    /**
     * Initializes the value for the {@link ExistingUser#getRole() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder role(Role role) {
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the value for the {@link ExistingUser#getPersonalInfo() personalInfo} attribute.
     * @param personalInfo The value for personalInfo 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder personalInfo(PersonalInfo personalInfo) {
      this.personalInfo = Objects.requireNonNull(personalInfo, "personalInfo");
      initBits &= ~INIT_BIT_PERSONAL_INFO;
      return this;
    }

    /**
     * Initializes the value for the {@link ExistingUser#getUserName() userName} attribute.
     * @param userName The value for userName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userName(String userName) {
      this.userName = Objects.requireNonNull(userName, "userName");
      initBits &= ~INIT_BIT_USER_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ExistingUser#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(long id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link ExistingUser#getStatus() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder status(UserStatus status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableExistingUser ImmutableExistingUser}.
     * @return An immutable instance of ExistingUser
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableExistingUser build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableExistingUser(role, personalInfo, userName, id, status);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ROLE) != 0) attributes.add("role");
      if ((initBits & INIT_BIT_PERSONAL_INFO) != 0) attributes.add("personalInfo");
      if ((initBits & INIT_BIT_USER_NAME) != 0) attributes.add("userName");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      return "Cannot build ExistingUser, some of required attributes are not set " + attributes;
    }
  }
}
