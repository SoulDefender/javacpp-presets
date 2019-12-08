// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;

/** \endcond
 <p>
 *  Primitive attributes
 * 
 *  @see \ref dev_guide_attributes */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive_attr extends dnnl_primitive_attr_handle {
    static { Loader.load(); }

    
        public primitive_attr() { super((Pointer)null); allocate(); }
        private native void allocate();
        public primitive_attr(@Const @ByRef primitive_attr arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef primitive_attr arg0);
        public primitive_attr(dnnl_primitive_attr t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
        private native void allocate(dnnl_primitive_attr t, @Cast("bool") boolean weak/*=false*/);
        public primitive_attr(dnnl_primitive_attr t) { super((Pointer)null); allocate(t); }
        private native void allocate(dnnl_primitive_attr t);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive_attr(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public primitive_attr(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public primitive_attr position(long position) {
        return (primitive_attr)super.position(position);
    }


    /** Creates default primitive attributes. */

    /** Creates primitive attributes from a C dnnl_primitive_attr_t handle.
     *  The resulting handle is never weak and the C handle will be destroyed
     *  during the destruction of the C++ object. */
    

    /** Returns the scratchpad mode. */
    public native scratchpad_mode get_scratchpad_mode();

    /** Sets scratchpad mode. */
    public native void set_scratchpad_mode(scratchpad_mode mode);
    public native void set_scratchpad_mode(@Cast("dnnl::scratchpad_mode") int mode);

    /** Gets correspondence scale \p mask and a constant floating point vector
     *  of output \p scales previously set by set_output_scales. */
    
    ///
    ///
    public native void get_output_scales(@ByRef IntPointer mask, @StdVector FloatPointer scales);
    public native void get_output_scales(@ByRef IntBuffer mask, @StdVector FloatBuffer scales);
    public native void get_output_scales(@ByRef int[] mask, @StdVector float[] scales);

    /** Sets output scales for primitive operations. The correspondence scale
     *  \p mask is stored for future use.
     * 
     *  The \p mask argument defines the correspondence between the output
     *  tensor dimensions and the \p scales vector. Set the i-th bit of \p mask
     *  to 1 to use a dedicated scaling factor for each slice of the output
     *  tensor over the i-th dimension. Set \p mask to 0 to use a common
     *  scaling factor for the whole output tensor.
     * 
     *  \note
     *       The dimension order is always native and does not depend on the
     *       actual layout used. Examples:
     *        - 2D dimensional data the order of dimensions is always: (n, c)
     *        - 4D dimensional data the order is always: (n, c, h, w)
     *        - 5D dimensional weights the order is always: (g, oc, ic, kh, kw) */
    public native void set_output_scales(int mask, @StdVector FloatPointer scales);
    public native void set_output_scales(int mask, @StdVector FloatBuffer scales);
    public native void set_output_scales(int mask, @StdVector float[] scales);

    /** Returns \p post_ops previously set by set_post_ops. */
    public native @Const @ByVal post_ops get_post_ops();

    /** Sets \p post_ops for future use. */
    public native void set_post_ops(@ByVal post_ops ops);

    /** Sets quantization \p scale and \p shift for RNN data tensors.  For
     *  performance reasons, the low-precision configuration of the RNN
     *  primitive expects input activations to have the unsigned int8 data type.
     *  Scale and shift used to quantize floating-point data to unsigned integer
     *  must be passed to the RNN primitive using attributes.
     *  \note
     *      Quantization scale and shift are common for src_layer, src_iter,
     *      dst_iter, and dst_layer. */
    
    ///
    public native void set_rnn_data_qparams(float scale, float shift);

    /** Sets quantization scales \p weights_scales for RNN weights tensors.  The
     *  low-precision configuration of the RNN primitive expects input weights
     *  to have the signed int8 data type. Scales used to quantize
     *  floating-point data to signed integer must be passed to the RNN
     *  primitive using attributes.  The \p mask argument defines correspondence
     *  between output tensor dimensions and the \p weights_scales array. Set
     *  the i-th bit of \p mask to 1 to use a dedicated scaling factor for each
     *  slice of the output tensor over the i-th dimension. Set \p mask to 0 to
     *  use a common scaling factor for the whole output tensor.
     *  \note
     *       The dimension order is always native and does not depend on the
     *       actual layout used. For example, five-dimensional weights always
     *       have (l, d, i, g, o) logical dimension ordering.
     *  \note
     *      Quantization scales are common for weights_layer and
     *      weights_iteration
     *  \note
     *      There is no way to check whether \p count corresponds to \p mask
     *      until an actual primitive descriptor is created, so it is the user's
     *      responsibility to set proper values. The following formula must
     *      hold:
     * 
     *       <pre>{@code \[count = \prod\limits_{d \in mask} output.dims[d]\]}</pre> */
    public native void set_rnn_weights_qparams(int mask, @StdVector FloatPointer scales);
    public native void set_rnn_weights_qparams(int mask, @StdVector FloatBuffer scales);
    public native void set_rnn_weights_qparams(int mask, @StdVector float[] scales);
}
