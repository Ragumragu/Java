package TestNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Retry_transform implements IAnnotationTransformer{
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		//IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);  //one method
		annotation.setRetryAnalyzer(Retry_analyzer.class); //second method
	}

}
