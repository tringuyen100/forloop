{\rtf1\ansi\ansicpg1252\cocoartf1343\cocoasubrtf160
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red63\green95\blue191;\red127\green159\blue191;
\red106\green62\blue62;\red42\green0\blue255;\red0\green0\blue192;}
\margl1440\margr1440\vieww16080\viewh12680\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs22 \cf2 import\cf0  java.util.Scanner;\
\
\pard\pardeftab720
\cf3 /**\cf0 \
\cf3  * \cf4 @author\cf3  \ul Tri\ulnone  \ul Nguyen\cf0 \ulnone \
\cf3  * \cf4 @date\cf3  \ul Feb\ulnone  19 2015\cf0 \
\cf3  * \cf0 \
\cf3  */\cf0 \
\pard\pardeftab720
\cf2 public\cf0  \cf2 class\cf0  Rectangle \{\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String[] \cf5 args\cf0 ) \{\
		String \cf5 width\cf0  = \cf6 ""\cf0 ;\
		String \cf5 height\cf0  = \cf6 ""\cf0 ;\
		\cf2 double\cf0  \cf5 w\cf0 , \cf5 h\cf0 , \cf5 p\cf0 , \cf5 a\cf0 ;\
		\
		Scanner \cf5 keyboard1\cf0  = \cf2 new\cf0  Scanner(System.\cf7 in\cf0 );\
		Scanner \cf5 keyboard2\cf0  = \cf2 new\cf0  Scanner(System.\cf7 in\cf0 );\
		\
		System.\cf7 out\cf0 .println(\cf6 "Enter the Width of Rectangle"\cf0 );\
		\cf5 width\cf0  = \cf5 keyboard1\cf0 .next();\
		System.\cf7 out\cf0 .println(\cf6 "Enter the Height of Rectangle"\cf0 );\
		\cf5 height\cf0  = \cf5 keyboard2\cf0 .next();\
		\
		\cf5 w\cf0  = Double.parseDouble(\cf5 width\cf0 );\
		\cf5 h\cf0  = Double.parseDouble(\cf5 height\cf0 );\
		\cf5 p\cf0  = (\cf5 w\cf0 +\cf5 h\cf0 )*2;\
		\cf5 a\cf0  = \cf5 w\cf0 *\cf5 h\cf0 ;\
		System.\cf7 out\cf0 .println(\cf6 "The Perimeter of Rectangle is "\cf0  + \cf5 p\cf0  + \
							\cf6 "\\nThe Area of Rectangle is "\cf0  + \cf5 a\cf0 );\
	\}\
\
\}\
}