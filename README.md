# confefe

confefe, pronounced con-feef, is a simple configuration language

confefe supports 8 different data types, plus comments:
- nil/null
- bool
- int
- decimal
- string
- date/time/datetime
- heterogeneous lists
- heterogeneous maps
- comments

confefe file extension is `.cf`

The top-level element of a confefe file must be either a list or a map.

**Note: Indentation levels are significant in the representation of unbracketed maps and unbracketed lists.**

Indentation style must be consistent across the entire configuration file, and must be **one** of the following:
- 2 spaces
- 4 spaces
- tabs

## Example

```
# comments are denoted with a leading hash symbol, followed by anything, followed by a newline

# nil/null may be supplied in place of any other value
nil
null

# boolean values
true
false

# integer values have arbitrary precision
-119419487192791019287401948710294871
-10
0
1
3
10
91912847019487109487109248710948710498714098714091784

# decimal values are represented with either a leading or trailing dot/period
# decimals take one of three forms:
# 1. <int>.<int>
# 2. <int>.
# 3. .<int>
# Form (2) has an implied trailing zero. Form (3) has an implied leading zero.
0.0
1.      # 1.0
.4      # 0.4
0.1     # 0.1

# strings are optionally double-quoted, but must be double-quoted when they would otherwise be interpreted as one of the other syntactic structures that confefe supports
# strings may span multiple lines, but must be double quoted if they do
foo
foo bar baz
"hello world"
"this is
a multi-
line string"

# Datetimes are denoted in the style defined by RFC-3339, except that the "T" is replaced with "@".
# Dates may be specified in isolation by dropping everything to the right of the "@".
# Times may be specified in isolation by dropping everything to the left of the "@".
1985-04-12@23:20:50.52Z
1985-04-12@
@23:20:50.52Z

1996-12-19@16:39:57-08:00
1996-12-19@
@16:39:57-08:00


# lists are denoted in one of two ways: (1) unbracketed, or (2) bracketed
# unbracketed lists may not be used within bracketed lists or bracketed maps
# indentation within a bracketed list is not significant

# bracketed list:
- dog
- cat
- cow
- bird

# bracketed list:
# bracketed lists must delimit each element with a comma; a trailing comma is allowed
[dog, cat, cow, bird]
[dog, cat, cow, bird,]          # trailing comma is allowed, but not mandatory
["dog", "cat", "cow", "bird"]


# maps are denoted in one of two ways: (1) unbracketed, or (2) bracketed
# unbracketed maps may not be used within bracketed lists or bracketed maps
# indentation within a bracketed map is not significant

# unbracketed map:
key1: value1
key2: value2
key3: value3

# bracketed map:
# bracketed maps must delimit each element with a comma; a trailing comma is allowed
{
  key1: value1,
  key2: value2,
  key3: value3,     # trailing comma is allowed, but not mandatory
}


# combinations of lists and maps:

# unbracketed list of unbracketed maps
- bob: 4        # first key/value pair may be on the same line as the hyphen; the remaining key/value pairs must be indented one level greater than the hyphen
  joe: 6
  roy: 1
-               # first key-value pair may be on the line immediately following the hyphen, indented one level greater than the hyphen
  eva: 6
  jane: 1
  amy: 7

# unbracketed list of bracketed maps
- {bob: 4, joe: 6, roy: 1}
- {
    eva: 6,
    jane: 1,
    amy: 7
  }

# bracketed list of unbracketed maps is not allowed

# bracketed list of bracketed maps
[
  { bob: 4, joe: 6, roy: 1 },
  {
    eva: 6,
    jane: 1,
    amy: 7
  }
]

# unbracketed map of unbracketed lists
boys:
  - bob
  - joe
  - roy
girls:
  - eva
  - jane
  - amy

# unbracketed map of bracketed lists
boys: [bob, joe, roy]
girls: [
  eva,
  jane,
  amy
]

# bracketed map of unbracketed lists is not allowed

# bracketed map of bracketed lists
{boys: [bob, joe, roy],
 girls: [eva,
         jane,
         amy]}


# nested lists

# unbracketed list of unbracketed lists
-
  - bob
  - joe
  - roy
-
  - eva
  - jane
  - amy

# unbracketed list of bracketed lists
- [bob, joe, roy]
- [eva,
   jane,
   amy,]

# bracketed list of unbracketed lists is not allowed

# bracketed list of bracketed lists
[ [bob, joe, roy],
  [eva, jane, amy] ]


# nested maps

# unbracketed map of unbracketed maps
boys:
  bob: 4
  joe: 6
  roy: 1
girls:
  eva: 6
  jane: 1
  amy: 7

# unbracketed map of bracketed maps
boys: {
  bob: 4,
  joe: 6,
  roy: 1
}
girls:
  {eva: 6, jane: 1, amy: 7}

# bracketed map of unbracketed maps is not allowed

# bracketed map of bracketed maps
{
  boys: {
    bob: 4,
    joe: 6,
    roy: 1
  },
  girls: {eva: 6, jane: 1, amy: 7}
}
```
