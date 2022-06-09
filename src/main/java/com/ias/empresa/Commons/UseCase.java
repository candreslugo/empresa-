package com.ias.empresa.Commons;

public interface UseCase<Input, Output> {
    Output excute(Input input);
}
