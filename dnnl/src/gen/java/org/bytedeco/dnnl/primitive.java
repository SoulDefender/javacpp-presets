// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Base class for all computational primitives. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive extends dnnl_primitive_handle {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive(Pointer p) { super(p); }

    /** Kinds of primitives. Used to implement a way to extend the library with
     *  new primitives without changing the ABI. */
    public enum kind {
        /** Undefined primitive */
        undef(dnnl_undefined_primitive),
        /** A reorder primitive. */
        reorder(dnnl_reorder),
        /** A shuffle primitive. */
        shuffle(dnnl_shuffle),
        /** A (out-of-place) concat primitive. */
        concat(dnnl_concat),
        /** A sum primitive. */
        sum(dnnl_sum),
        /** A convolution primitive. */
        convolution(dnnl_convolution),
        /** A deconvolution primitive. */
        deconvolution(dnnl_deconvolution),
        /** An element-wise primitive. */
        eltwise(dnnl_eltwise),
        /** A softmax primitive. */
        softmax(dnnl_softmax),
        /** A pooling primitive. */
        pooling(dnnl_pooling),
        /** An LRN primitive. */
        lrn(dnnl_lrn),
        /** A batch normalization primitive. */
        batch_normalization(dnnl_batch_normalization),
        /** A layer normalization primitive. */
        layer_normalization(dnnl_layer_normalization),
        /** An inner product primitive. */
        inner_product(dnnl_inner_product),
        /** A rnn primitive. */
        rnn(dnnl_rnn),
        /** A binary primitive. */
        binary(dnnl_binary);

        public final int value;
        private kind(int v) { this.value = v; }
        private kind(kind e) { this.value = e.value; }
        public kind intern() { for (kind e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    public primitive(@Const dnnl_primitive_desc c_pd) { super((Pointer)null); allocate(c_pd); }
    private native void allocate(@Const dnnl_primitive_desc c_pd);
    public primitive(@Const @ByRef org.bytedeco.dnnl.primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef org.bytedeco.dnnl.primitive_desc pd);

    /** Returns the descriptor of the underlying C API primitive. */
    public native @Name("get_primitive_desc") @Const dnnl_primitive_desc get_dnnl_primitive_desc();
    // TODO: use the C++ API wrapper structure.

    public native void execute(
                @ByRef stream astream, @Const @ByRef IntMemoryMap args);
}
