// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Name("TessCallback1<STRING>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class StringClearCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StringClearCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringClearCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringClearCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StringClearCallback position(long position) {
        return (StringClearCallback)super.position(position);
    }

  @Virtual(true) public native void Run(@ByVal STRING arg0);
}
