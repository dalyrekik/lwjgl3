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
 * Holds the transform for a single bone.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VRBoneTransform_t {
 *     {@link HmdVector4 HmdVector4_t} position;
 *     {@link HmdQuaternionf HmdQuaternionf_t} orientation;
 * }</pre></code>
 */
@NativeType("struct VRBoneTransform_t")
public class VRBoneTransform extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITION,
        ORIENTATION;

    static {
        Layout layout = __struct(
            __member(HmdVector4.SIZEOF, HmdVector4.ALIGNOF),
            __member(HmdQuaternionf.SIZEOF, HmdQuaternionf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITION = layout.offsetof(0);
        ORIENTATION = layout.offsetof(1);
    }

    VRBoneTransform(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VRBoneTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRBoneTransform(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector4} view of the {@code position} field. */
    @NativeType("HmdVector4_t")
    public HmdVector4 position$() { return nposition$(address()); }
    /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRBoneTransform position$(java.util.function.Consumer<HmdVector4> consumer) { consumer.accept(position$()); return this; }
    /** Returns a {@link HmdQuaternionf} view of the {@code orientation} field. */
    @NativeType("HmdQuaternionf_t")
    public HmdQuaternionf orientation() { return norientation(address()); }
    /** Passes the {@code orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VRBoneTransform orientation(java.util.function.Consumer<HmdQuaternionf> consumer) { consumer.accept(orientation()); return this; }

    // -----------------------------------

    /** Returns a new {@link VRBoneTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRBoneTransform malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VRBoneTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRBoneTransform calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VRBoneTransform} instance allocated with {@link BufferUtils}. */
    public static VRBoneTransform create() {
        return new VRBoneTransform(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VRBoneTransform} instance for the specified memory address. */
    public static VRBoneTransform create(long address) {
        return new VRBoneTransform(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRBoneTransform createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VRBoneTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRBoneTransform.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VRBoneTransform} instance allocated on the thread-local {@link MemoryStack}. */
    public static VRBoneTransform mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VRBoneTransform} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VRBoneTransform callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VRBoneTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRBoneTransform mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VRBoneTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRBoneTransform callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #position$}. */
    public static HmdVector4 nposition$(long struct) { return HmdVector4.create(struct + VRBoneTransform.POSITION); }
    /** Unsafe version of {@link #orientation}. */
    public static HmdQuaternionf norientation(long struct) { return HmdQuaternionf.create(struct + VRBoneTransform.ORIENTATION); }

    // -----------------------------------

    /** An array of {@link VRBoneTransform} structs. */
    public static class Buffer extends StructBuffer<VRBoneTransform, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VRBoneTransform.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRBoneTransform#SIZEOF}, and its mark will be undefined.
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
        protected VRBoneTransform newInstance(long address) {
            return new VRBoneTransform(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdVector4} view of the {@code position} field. */
        @NativeType("HmdVector4_t")
        public HmdVector4 position$() { return VRBoneTransform.nposition$(address()); }
        /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRBoneTransform.Buffer position$(java.util.function.Consumer<HmdVector4> consumer) { consumer.accept(position$()); return this; }
        /** Returns a {@link HmdQuaternionf} view of the {@code orientation} field. */
        @NativeType("HmdQuaternionf_t")
        public HmdQuaternionf orientation() { return VRBoneTransform.norientation(address()); }
        /** Passes the {@code orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VRBoneTransform.Buffer orientation(java.util.function.Consumer<HmdQuaternionf> consumer) { consumer.accept(orientation()); return this; }

    }

}