package ru.relex.food_delivery.services.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserStatus}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserStatus.builder()}.
 */
@Generated(from = "UserStatus", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableUserStatus implements UserStatus {
  private final boolean isActive;
  private final boolean isLocked;

  private ImmutableUserStatus(ImmutableUserStatus.Builder builder) {
    if (builder.isActiveIsSet()) {
      initShim.isActive(builder.isActive);
    }
    if (builder.isLockedIsSet()) {
      initShim.isLocked(builder.isLocked);
    }
    this.isActive = initShim.isActive();
    this.isLocked = initShim.isLocked();
    this.initShim = null;
  }

  private ImmutableUserStatus(boolean isActive, boolean isLocked) {
    this.isActive = isActive;
    this.isLocked = isLocked;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "UserStatus", generator = "Immutables")
  private final class InitShim {
    private byte isActiveBuildStage = STAGE_UNINITIALIZED;
    private boolean isActive;

    boolean isActive() {
      if (isActiveBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isActiveBuildStage == STAGE_UNINITIALIZED) {
        isActiveBuildStage = STAGE_INITIALIZING;
        this.isActive = isActiveInitialize();
        isActiveBuildStage = STAGE_INITIALIZED;
      }
      return this.isActive;
    }

    void isActive(boolean isActive) {
      this.isActive = isActive;
      isActiveBuildStage = STAGE_INITIALIZED;
    }

    private byte isLockedBuildStage = STAGE_UNINITIALIZED;
    private boolean isLocked;

    boolean isLocked() {
      if (isLockedBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (isLockedBuildStage == STAGE_UNINITIALIZED) {
        isLockedBuildStage = STAGE_INITIALIZING;
        this.isLocked = isLockedInitialize();
        isLockedBuildStage = STAGE_INITIALIZED;
      }
      return this.isLocked;
    }

    void isLocked(boolean isLocked) {
      this.isLocked = isLocked;
      isLockedBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (isActiveBuildStage == STAGE_INITIALIZING) attributes.add("isActive");
      if (isLockedBuildStage == STAGE_INITIALIZING) attributes.add("isLocked");
      return "Cannot build UserStatus, attribute initializers form cycle " + attributes;
    }
  }

  private boolean isActiveInitialize() {
    return UserStatus.super.isActive();
  }

  private boolean isLockedInitialize() {
    return UserStatus.super.isLocked();
  }

  /**
   * @return The value of the {@code isActive} attribute
   */
  @JsonProperty("isActive")
  @Override
  public boolean isActive() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isActive()
        : this.isActive;
  }

  /**
   * @return The value of the {@code isLocked} attribute
   */
  @JsonProperty("isLocked")
  @Override
  public boolean isLocked() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.isLocked()
        : this.isLocked;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserStatus#isActive() isActive} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isActive
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserStatus withIsActive(boolean value) {
    if (this.isActive == value) return this;
    return new ImmutableUserStatus(value, this.isLocked);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UserStatus#isLocked() isLocked} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isLocked
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUserStatus withIsLocked(boolean value) {
    if (this.isLocked == value) return this;
    return new ImmutableUserStatus(this.isActive, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserStatus} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserStatus
        && equalTo((ImmutableUserStatus) another);
  }

  private boolean equalTo(ImmutableUserStatus another) {
    return isActive == another.isActive
        && isLocked == another.isLocked;
  }

  /**
   * Computes a hash code from attributes: {@code isActive}, {@code isLocked}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Boolean.hashCode(isActive);
    h += (h << 5) + Boolean.hashCode(isLocked);
    return h;
  }

  /**
   * Prints the immutable value {@code UserStatus} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "UserStatus{"
        + "isActive=" + isActive
        + ", isLocked=" + isLocked
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link UserStatus} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserStatus instance
   */
  public static ImmutableUserStatus copyOf(UserStatus instance) {
    if (instance instanceof ImmutableUserStatus) {
      return (ImmutableUserStatus) instance;
    }
    return ImmutableUserStatus.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableUserStatus ImmutableUserStatus}.
   * <pre>
   * ImmutableUserStatus.builder()
   *    .isActive(boolean) // optional {@link UserStatus#isActive() isActive}
   *    .isLocked(boolean) // optional {@link UserStatus#isLocked() isLocked}
   *    .build();
   * </pre>
   * @return A new ImmutableUserStatus builder
   */
  public static ImmutableUserStatus.Builder builder() {
    return new ImmutableUserStatus.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableUserStatus ImmutableUserStatus}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserStatus", generator = "Immutables")
  public static final class Builder {
    private static final long OPT_BIT_IS_ACTIVE = 0x1L;
    private static final long OPT_BIT_IS_LOCKED = 0x2L;
    private long optBits;

    private boolean isActive;
    private boolean isLocked;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code UserStatus} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(UserStatus instance) {
      Objects.requireNonNull(instance, "instance");
      isActive(instance.isActive());
      isLocked(instance.isLocked());
      return this;
    }

    /**
     * Initializes the value for the {@link UserStatus#isActive() isActive} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UserStatus#isActive() isActive}.</em>
     * @param isActive The value for isActive 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isActive")
    public final Builder isActive(boolean isActive) {
      this.isActive = isActive;
      optBits |= OPT_BIT_IS_ACTIVE;
      return this;
    }

    /**
     * Initializes the value for the {@link UserStatus#isLocked() isLocked} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link UserStatus#isLocked() isLocked}.</em>
     * @param isLocked The value for isLocked 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isLocked")
    public final Builder isLocked(boolean isLocked) {
      this.isLocked = isLocked;
      optBits |= OPT_BIT_IS_LOCKED;
      return this;
    }

    /**
     * Builds a new {@link ImmutableUserStatus ImmutableUserStatus}.
     * @return An immutable instance of UserStatus
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableUserStatus build() {
      return new ImmutableUserStatus(this);
    }

    private boolean isActiveIsSet() {
      return (optBits & OPT_BIT_IS_ACTIVE) != 0;
    }

    private boolean isLockedIsSet() {
      return (optBits & OPT_BIT_IS_LOCKED) != 0;
    }
  }
}
