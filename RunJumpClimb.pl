#!/usr/bin/perl
# The Warrior Code
$life = <>;
$life =~ s/#?
			(?:material|excessive?|narciss(us)?)
			(ism|ness|ist)?
		 /running jumping & climbing!\n
		 /igx;
print $life;
