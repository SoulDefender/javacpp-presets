// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \struct dnnl_stream
 *  An opaque structure to describe an execution stream. */
@Opaque @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_stream extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public dnnl_stream() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_stream(Pointer p) { super(p); }
}
