// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Namespace("tesseract::Dict") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class ParamsModelClassifyFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ParamsModelClassifyFunc(Pointer p) { super(p); }
    public native float call(Dict o, @Cast("const char*") BytePointer arg0, Pointer arg1);
}
