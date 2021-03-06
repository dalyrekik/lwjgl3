/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bActive} &ndash; whether or not this action is currently available to be bound in the active action set</li>
 * <li>{@code activeOrigin} &ndash; the origin that caused this action's current state</li>
 * <li>{@code x} &ndash; the current state of this action; will be delta updates for mouse actions</li>
 * <li>{@code y} &ndash; the current state of this action; will be delta updates for mouse actions</li>
 * <li>{@code z} &ndash; the current state of this action; will be delta updates for mouse actions</li>
 * <li>{@code deltaX} &ndash; teltas since the previous call to {@link VRInput#VRInput_UpdateActionState UpdateActionState}</li>
 * <li>{@code deltaY} &ndash; teltas since the previous call to {@link VRInput#VRInput_UpdateActionState UpdateActionState}</li>
 * <li>{@code deltaZ} &ndash; teltas since the previous call to {@link VRInput#VRInput_UpdateActionState UpdateActionState}</li>
 * <li>{@code fUpdateTime} &ndash; time relative to now when this event happened. Will be negative to indicate a past time</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct InputAnalogActionData_t {
 *     bool bActive;
 *     VRInputValueHandle_t activeOrigin;
 *     float x;
 *     float y;
 *     float z;
 *     float deltaX;
 *     float deltaY;
 *     float deltaZ;
 *     float fUpdateTime;
 * }</pre></code>
 */
@NativeType("struct InputAnalogActionData_t")
public class InputAnalogActionData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACTIVE,
        ACTIVEORIGIN,
        X,
        Y,
        Z,
        DELTAX,
        DELTAY,
        DELTAZ,
        FUPDATETIME;

    static {
        Layout layout = __struct(
            __member(1),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACTIVE = layout.offsetof(0);
        ACTIVEORIGIN = layout.offsetof(1);
        X = layout.offsetof(2);
        Y = layout.offsetof(3);
        Z = layout.offsetof(4);
        DELTAX = layout.offsetof(5);
        DELTAY = layout.offsetof(6);
        DELTAZ = layout.offsetof(7);
        FUPDATETIME = layout.offsetof(8);
    }

    InputAnalogActionData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link InputAnalogActionData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public InputAnalogActionData(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bActive} field. */
    @NativeType("bool")
    public boolean bActive() { return nbActive(address()); }
    /** Returns the value of the {@code activeOrigin} field. */
    @NativeType("VRInputValueHandle_t")
    public long activeOrigin() { return nactiveOrigin(address()); }
    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    public float z() { return nz(address()); }
    /** Returns the value of the {@code deltaX} field. */
    public float deltaX() { return ndeltaX(address()); }
    /** Returns the value of the {@code deltaY} field. */
    public float deltaY() { return ndeltaY(address()); }
    /** Returns the value of the {@code deltaZ} field. */
    public float deltaZ() { return ndeltaZ(address()); }
    /** Returns the value of the {@code fUpdateTime} field. */
    public float fUpdateTime() { return nfUpdateTime(address()); }

    // -----------------------------------

    /** Returns a new {@link InputAnalogActionData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static InputAnalogActionData malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link InputAnalogActionData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static InputAnalogActionData calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link InputAnalogActionData} instance allocated with {@link BufferUtils}. */
    public static InputAnalogActionData create() {
        return new InputAnalogActionData(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link InputAnalogActionData} instance for the specified memory address. */
    public static InputAnalogActionData create(long address) {
        return new InputAnalogActionData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static InputAnalogActionData createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link InputAnalogActionData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static InputAnalogActionData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link InputAnalogActionData} instance allocated on the thread-local {@link MemoryStack}. */
    public static InputAnalogActionData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link InputAnalogActionData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static InputAnalogActionData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link InputAnalogActionData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static InputAnalogActionData mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link InputAnalogActionData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static InputAnalogActionData callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link InputAnalogActionData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static InputAnalogActionData.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bActive}. */
    public static boolean nbActive(long struct) { return memGetByte(struct + InputAnalogActionData.BACTIVE) != 0; }
    /** Unsafe version of {@link #activeOrigin}. */
    public static long nactiveOrigin(long struct) { return memGetLong(struct + InputAnalogActionData.ACTIVEORIGIN); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + InputAnalogActionData.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + InputAnalogActionData.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return memGetFloat(struct + InputAnalogActionData.Z); }
    /** Unsafe version of {@link #deltaX}. */
    public static float ndeltaX(long struct) { return memGetFloat(struct + InputAnalogActionData.DELTAX); }
    /** Unsafe version of {@link #deltaY}. */
    public static float ndeltaY(long struct) { return memGetFloat(struct + InputAnalogActionData.DELTAY); }
    /** Unsafe version of {@link #deltaZ}. */
    public static float ndeltaZ(long struct) { return memGetFloat(struct + InputAnalogActionData.DELTAZ); }
    /** Unsafe version of {@link #fUpdateTime}. */
    public static float nfUpdateTime(long struct) { return memGetFloat(struct + InputAnalogActionData.FUPDATETIME); }

    // -----------------------------------

    /** An array of {@link InputAnalogActionData} structs. */
    public static class Buffer extends StructBuffer<InputAnalogActionData, Buffer> implements NativeResource {

        /**
         * Creates a new {@link InputAnalogActionData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link InputAnalogActionData#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected InputAnalogActionData newInstance(long address) {
            return new InputAnalogActionData(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code bActive} field. */
        @NativeType("bool")
        public boolean bActive() { return InputAnalogActionData.nbActive(address()); }
        /** Returns the value of the {@code activeOrigin} field. */
        @NativeType("VRInputValueHandle_t")
        public long activeOrigin() { return InputAnalogActionData.nactiveOrigin(address()); }
        /** Returns the value of the {@code x} field. */
        public float x() { return InputAnalogActionData.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return InputAnalogActionData.ny(address()); }
        /** Returns the value of the {@code z} field. */
        public float z() { return InputAnalogActionData.nz(address()); }
        /** Returns the value of the {@code deltaX} field. */
        public float deltaX() { return InputAnalogActionData.ndeltaX(address()); }
        /** Returns the value of the {@code deltaY} field. */
        public float deltaY() { return InputAnalogActionData.ndeltaY(address()); }
        /** Returns the value of the {@code deltaZ} field. */
        public float deltaZ() { return InputAnalogActionData.ndeltaZ(address()); }
        /** Returns the value of the {@code fUpdateTime} field. */
        public float fUpdateTime() { return InputAnalogActionData.nfUpdateTime(address()); }

    }

}