// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \addtogroup c_api C API
 *  \{
 *
 *  \addtogroup c_api_types Types
 *  \{
 *
 *  \addtogroup c_api_types_generic Generic
 *  \{ */

/** Intel(R) MKL-DNN Version type */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_version_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_version_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_version_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_version_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_version_t position(long position) {
        return (mkldnn_version_t)super.position(position);
    }

    public native int major(); public native mkldnn_version_t major(int setter);
    public native int minor(); public native mkldnn_version_t minor(int setter);
    public native int patch(); public native mkldnn_version_t patch(int setter);
    public native @Cast("const char*") BytePointer hash(); public native mkldnn_version_t hash(BytePointer setter);
}
