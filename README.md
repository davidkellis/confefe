# confefe

confefe, pronounced con-feef, is a simple configuration language

confefe supports 8 different data types, plus comments:
- nil
- bool
- int
- decimal
- string
- date/time/datetime
- heterogeneous lists
- heterogeneous maps
- comments

confefe file extension is `.cf`

**Note: Indentation levels are significant in the notation of unbracketed maps and hyphenated/unbracketed lists.**

Indentation style must be consistent across the entire configuration file, and must be **one** of the following:
- 2 spaces
- 4 spaces
- tabs


## Example

```
# comments are denoted with a leading hash symbol, followed by anything, followed by a newline

# nil may be supplied in place of any other value
nil    # nil is the only value of the Nil type

# true and false are the only values of the Bool type
true
false

# integer values are represented by the Int type
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

# strings are optionally double-quoted
# strings must only be quoted when they would otherwise be interpreted as one of the other syntactic structures that confefe supports
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


# lists are denoted in one of two ways: (1) hyphenated/unbracketed, or (2) bracketed

# hyphenated/bracketed list:
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

# hyphenated list of unbracketed maps
- bob: 4
  joe: 6
  roy: 1
- eva: 6
  jane: 1
  amy: 7

# hyphenated list of bracketed maps
- {bob: 4, joe: 6, roy: 1}
- {
    eva: 6,
    jane: 1,
    amy: 7
  }

# bracketed list of unbracketed maps
[
  bob: 4
  joe: 6
  roy: 1,
  eva: 6
  jane: 1
  amy: 7
]

# bracketed list of bracketed maps
[
  { bob: 4, joe: 6, roy: 1 },
  {
    eva: 6,
    jane: 1,
    amy: 7
  }
]

# unbracketed map of hyphenated lists
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

# bracketed map of hyphenated lists - I might make this invalid
{
  boys:
    - bob
    - joe
    - roy,
  girls:
    - eva
    - jane
    - amy
}

# bracketed map of bracketed lists
{boys: [bob, joe, roy],
 girls: [eva,
         jane,
         amy]}
```
