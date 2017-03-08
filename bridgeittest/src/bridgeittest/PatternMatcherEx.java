package bridgeittest;

import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherEx {
public static void main(String[] args){
	String str="This is the pattern matcher example to match a string in the given string";
	String pattern=".*the.*";
	boolean matches=Pattern.matches(pattern,str);
	//matches=Pattern.replace(pattern,str);
	System.out.println("matches:"+matches);
	
	String str1="http:// This is the pattern matcher ex";
	String patternmatcher=".*http://.*";
	Pattern pattern1=Pattern.compile(patternmatcher,Pattern.CASE_INSENSITIVE);
	Matcher  matcher=pattern1.matcher(str);
	boolean matches1=matcher.matches();
	System.out.println("Matcher:"+matcher);
	String text="A sep,Text sep With, sep Many sep, Separators";
	String patternstring=",";
	Pattern pattern2=Pattern.compile(patternstring);
	String[] split=pattern2.split(text);
	System.out.println("split.length:"+split.length);
	for(String element:split){
		System.out.println("Element:"+element);
	}
	/*String patternstring1="sep";
	Pattern pattern3=Pattern.compile(patternstring);
	String pattern2=pattern.pattern3();*/
	//lookingAt()
	String str2="This is the text to be searched";
	String patternstring0="This is the";
	Pattern patter=Pattern.compile(patternstring);
	Matcher matche=patter.matcher(str2);
	System.out.println("looking at:"+matcher.lookingAt());
	System.out.println("matches:"+matcher.matches());
	String str3="this is the matcher pattern test in which i have to find is  the index of some word is";
	String patterns="is";
	Pattern patt= Pattern.compile(patternstring);
	Matcher mat=patt.matcher(str3);
	int count=0;
	while(matcher.find()){
		count++;
		//System.out.println();
		System.out.println("found:"+count+" "+matcher.start()+" "+matcher.end());
	}
	String str4="John writes about this, and John Doe writes about that," +
            " and John Wayne writes about everything.";
	String patternmatcher1="(John) (.+?)";
	Pattern pattern9=Pattern.compile(patternmatcher1);
	//Matcher matcher2=pattern2.matches(str4);
	while(matcher.find()){
		System.out.println("found: "+ matcher.group(1) + " " + matcher.group(2));
	}
	String str5="this is the replaceall kk";
	String patternmatcher7="(the) (replaceall)";
	
	Pattern pattern4=Pattern.compile(patternmatcher7);
	Matcher matcher8=pattern4.matcher(str5);
	
	String replaceAll=matcher.replaceAll("regex ");
	System.out.println("replaceall: " + replaceAll);

		
	String replaceFirst=matcher.replaceFirst("Hey ");
	System.out.println("replaceFirst: " + replaceFirst);
	//String str="its the replacement test and append test";

	String str6="John writes about this, fullname John Doe writes about that," +
    " and John Wayne's +91-xxxxxxxxxx writes about everything on this date xx/xx/xxxx";
	String patternmacther="(john)";
	String patternmacther1="(fullname)";
	String patternmacther7="(John) (writes)";
	Pattern pattern6=Pattern.compile(patternmacther);
	Matcher matcher6=pattern6.matcher(str6);
	/*
	String sbfr=sbf.readline();
	while(matcher.find()){
		matcher.appendReplacement(sbf,"hey bro");
		//System.out.println(sbf.toString());
	}
	
	matcher.appendTail(sbf);
	System.out.println(sbf.toString());
	}*/
}
}