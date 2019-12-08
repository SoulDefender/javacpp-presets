// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Inner product for backward propagation with respect to data.  Implements
 *  descriptor, primitive descriptor, and primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class inner_product_backward_data extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_backward_data(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public inner_product_backward_data(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public inner_product_backward_data position(long position) {
        return (inner_product_backward_data)super.position(position);
    }


    /** Initializes an inner product descriptor for backward propagation with
     *  respect to data using memory descriptors.
     * 
     *  \note Memory descriptors are allowed to be initialized with
     *        #dnnl::memory::format_tag::any value of \p format_kind. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef dnnl_inner_product_desc_t data(); public native desc data(dnnl_inner_product_desc_t setter);
        public desc(@Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(diff_src_desc, weights_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
    }

    /** Primitive descriptor for inner product backward propagation with
     *  respect to data. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, e, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Initializes a primitive descriptor for inner product backward
         *  propagation from a C primitive descriptor \p pd. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** Queries diff source gradient memory descriptor. */
        public native @ByVal memory.desc diff_src_desc();

        /** Queries weights memory descriptor. */
        public native @ByVal memory.desc weights_desc();

        /** Queries diff destination memory descriptor. */
        public native @ByVal memory.desc diff_dst_desc();
    }

    public inner_product_backward_data() { super((Pointer)null); allocate(); }
    private native void allocate();

    public inner_product_backward_data(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
