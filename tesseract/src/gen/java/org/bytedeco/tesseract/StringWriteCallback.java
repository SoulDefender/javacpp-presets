// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessResultCallback2<bool,FILE*,const STRING&>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class StringWriteCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StringWriteCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringWriteCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringWriteCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StringWriteCallback position(long position) {
        return (StringWriteCallback)super.position(position);
    }

  @Virtual(true) public native @Cast("bool") boolean Run(@Cast("FILE*") Pointer arg0, @Const @ByRef STRING arg1);
}
