package com.qatest;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TrackTestExecution_Testng_Listener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult result) {
        if (method.isTestMethod() && ITestResult.FAILURE == result.getStatus()) {
            Throwable throwable = result.getThrowable();
            String originalMessage = throwable.getMessage();
            String newMessage = originalMessage + 
            		"\n--------------------------------------------------------------------------------------------------------------\n ( TestNG Listener class Message for Failed Test Case  ) - Test 5 - is Fail for Email_End_Syntax_validation_for_Email_id_0_Comment_id_101_Postid_21_by_user_Samantha \n End syntax of Email_id_0_ is found not matching to the standard generic top-level domains (gTLD) being compared for this test like -  ( .com/.org/.net/.de/.us/.co.uk/ .biz/ )"
            		+ "\n-------------------------------------------------------------------------------------------------------------- \n ";
            try {
                FieldUtils.writeField(throwable, "detailMessage", newMessage, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
