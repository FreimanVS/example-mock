package com.vfreiman.lessons.testing.mock.injection;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.replay;

public class ATest {
    @Rule
    public EasyMockRule em = new EasyMockRule(this);

    @Mock
    SomeInterface someInterface;

    @TestSubject
    A testedObject = new A(someInterface);

    @Test
    public void testOpinion() {
        expect(someInterface.methodInterface()).andStubReturn("some text is returned");
        replay(someInterface);

        assertThat(testedObject.method(), is("Method A some text is returned"));
    }
}