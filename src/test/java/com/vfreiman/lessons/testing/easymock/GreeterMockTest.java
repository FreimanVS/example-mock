package com.vfreiman.lessons.testing.easymock;

import com.vfreiman.lessons.testing.mock.Greeter;
import com.vfreiman.lessons.testing.mock.SomeObject;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.MockType;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class GreeterMockTest {

    @Rule
    public EasyMockRule em = new EasyMockRule(this);

    @Mock(type = MockType.NICE)
    private SomeObject mockedObject;

    @TestSubject
    private Greeter testedObject = new Greeter(mockedObject);

    @Test
    public void testTrue() {
        expect(mockedObject.isFlag()).andReturn(true);
        replay(mockedObject);

        assertThat(testedObject.getString(), is("TRUE FLAG"));
    }

    @Test
    public void testFalse() {
        replay(mockedObject);
        assertThat(testedObject.getString(), is("FALSE FLAG"));
    }

}
