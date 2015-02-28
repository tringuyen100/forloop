{\rtf1\ansi\ansicpg1252\cocoartf1343\cocoasubrtf160
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs22 \cf2 import java.util.Scanner;\
\
public class Username \{\
	public static void main(String[] args) \{\
		String Username2 = \'93Admin\'94;\
		String Password = \'93Pass\'94;\
		\
		System.out.println(\'93Please enter your username\'94);\
		Scanner keyboard = new Scanner(System.in);\
		Username2 = keyboard.next();\
	\
	if(Username2.compareTo(\'93Admin\'94) == 0) \{\
		System.out.println(\'93Please enter your password\'94);\
		Scanner keyboard1 = new Scanner(System.in);\
		Password = keyboard.next();\
		if(Password.compareTo(\'93Pass\'94) == 0) \{\
			System.out.println(\'93Welcome User!\'94);\
		\} else \{\
			System.out.println(\'93Your password is incorrect\'94);\
		\} \
	\} else \{\
		System.out.println(\'93Your username is incorrect\'94);\
	\}\
\}\
\}\
}