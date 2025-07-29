# 16 Inheritance
## Let's Practice: Word Guessing Game
## Objective
### <p>Create a **Word Guessing Game** in Java that follows Object-Oriented Programming (OOP) principles, specifically focusing on inheritance and method overriding.<p>
## Key Features
### <p>1. **Randomly selects a word** from a predefined pool.<p>
### <p>2. Provides **hints** by revealing letters one by one **after incorrect attempts**.<p>
### <p>3. **Tracks attempts** and the revealed letters.<p>
### <p>4. Uses **inheritance** (single-level and multilevel) to organize the code.<p>
### <P>5. Implements **method overriding** for different hinting strategies.<p>
### <p>6. Handles **user input** with Scanner.<P>
### <p>7. Utilizes **random number generation** (Random) to choose words and reveal hints.<p>
## Step-by-Step Instructions
### <p>1️⃣ **Create a Base Class (Game)**<p>
### <p>This class holds the core game logic:<p>
#### <p>• The word to be guessed<p>
#### <p>• Number of attempts<p>
#### <p>• Handling letter reveal functionality<p>
### <p>2️⃣ **Extend Game into InputGame (Single-Level Inheritance)**<p>
#### <p>• Adds **user input handling**.<p>
#### <p>• **Overrides** the playGame() method to allow players to enter guesses.<p>
### <p>3️⃣ **Extend InputGame into AdvancedGame (Multilevel Inheritance)**<p>
#### <p>• Improves hints by **revealing random letters** after incorrect attempts.<p>
#### <p>• **Overrides** displayHint() for more advanced hint functionality.<p>
## Suggested Class Structure
### 1. Game (Base Class)
### 2. │
### 3. ├──> InputGame (Extends Game, adds user input handling)
### 4. │
### 5. └──> AdvancedGame (Extends InputGame, adds advanced hints)
