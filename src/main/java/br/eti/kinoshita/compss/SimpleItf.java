package br.eti.kinoshita.compss;

import es.bsc.compss.types.annotations.Parameter;
import es.bsc.compss.types.annotations.parameter.Direction;
import es.bsc.compss.types.annotations.parameter.Type;
import es.bsc.compss.types.annotations.task.Method;

public interface SimpleItf {

    @Method(declaringClass = "simple.SimpleImpl")
    void increment(
            @Parameter(type = Type.FILE, direction = Direction.INOUT)
            String file
    );

}